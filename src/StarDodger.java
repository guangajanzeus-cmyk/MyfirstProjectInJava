import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class StarDodger extends JPanel implements ActionListener, KeyListener {

    static final int WIDTH = 600;
    static final int HEIGHT = 700;
    static final int PLAYER_SIZE = 40;
    static final int PLAYER_SPEED = 6;
    static final int BULLET_SPEED = 12;
    static final int SHOOT_COOLDOWN_MAX = 12;

    class Enemy {
        double x, y, size, speed;
        Enemy(double x, double y, double size, double speed) {
            this.x = x; this.y = y; this.size = size; this.speed = speed;
        }
        Rectangle bounds() {
            return new Rectangle((int) x, (int) y, (int) size, (int) size);
        }
    }

    class Bullet {
        double x, y;
        Bullet(double x, double y) { this.x = x; this.y = y; }
        Rectangle bounds() {
            return new Rectangle((int) x - 2, (int) y - 8, 4, 16);
        }
    }

    class Star {
        double x, y, speed;
        Star(double x, double y, double speed) { this.x = x; this.y = y; this.speed = speed; }
    }

    Timer timer;
    Random rand = new Random();
    Set<Integer> pressedKeys = new HashSet<>();

    double playerX = WIDTH / 2.0 - PLAYER_SIZE / 2.0;
    double playerY = HEIGHT - 80;

    List<Enemy> enemies = new ArrayList<>();
    List<Bullet> bullets = new ArrayList<>();
    List<Star> stars = new ArrayList<>();

    int score = 0;
    int frameCount = 0;
    int spawnTimer = 0;
    int spawnInterval = 55;
    int shootCooldown = 0;
    boolean gameOver = false;

    public StarDodger() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        for (int i = 0; i < 80; i++) {
            stars.add(new Star(rand.nextInt(WIDTH), rand.nextInt(HEIGHT), 1 + rand.nextDouble() * 2));
        }

        timer = new Timer(16, this);
        timer.start();
    }

    void resetGame() {
        playerX = WIDTH / 2.0 - PLAYER_SIZE / 2.0;
        playerY = HEIGHT - 80;
        enemies.clear();
        bullets.clear();
        score = 0;
        frameCount = 0;
        spawnTimer = 0;
        spawnInterval = 55;
        shootCooldown = 0;
        gameOver = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            update();
        }
        repaint();
    }

    void update() {
        frameCount++;

        if (pressedKeys.contains(KeyEvent.VK_LEFT)) playerX -= PLAYER_SPEED;
        if (pressedKeys.contains(KeyEvent.VK_RIGHT)) playerX += PLAYER_SPEED;
        if (pressedKeys.contains(KeyEvent.VK_UP)) playerY -= PLAYER_SPEED;
        if (pressedKeys.contains(KeyEvent.VK_DOWN)) playerY += PLAYER_SPEED;

        playerX = Math.max(0, Math.min(WIDTH - PLAYER_SIZE, playerX));
        playerY = Math.max(0, Math.min(HEIGHT - PLAYER_SIZE, playerY));

        if (shootCooldown > 0) shootCooldown--;
        if (pressedKeys.contains(KeyEvent.VK_SPACE) && shootCooldown == 0) {
            bullets.add(new Bullet(playerX + PLAYER_SIZE / 2.0, playerY));
            shootCooldown = SHOOT_COOLDOWN_MAX;
        }

        for (Bullet b : bullets) b.y -= BULLET_SPEED;
        bullets.removeIf(b -> b.y < -20);

        spawnTimer++;
        if (spawnTimer >= spawnInterval) {
            spawnTimer = 0;
            double size = 24 + rand.nextInt(24);
            double x = rand.nextDouble() * (WIDTH - size);
            double speed = 2 + rand.nextDouble() * 2 + Math.min(score / 100.0, 4);
            enemies.add(new Enemy(x, -size, size, speed));
            if (spawnInterval > 20) spawnInterval--;
        }

        for (Enemy en : enemies) en.y += en.speed;
        enemies.removeIf(en -> en.y > HEIGHT + 40);

        List<Enemy> deadEnemies = new ArrayList<>();
        List<Bullet> deadBullets = new ArrayList<>();
        for (Bullet b : bullets) {
            for (Enemy en : enemies) {
                if (b.bounds().intersects(en.bounds())) {
                    deadEnemies.add(en);
                    deadBullets.add(b);
                    score += 10;
                }
            }
        }
        enemies.removeAll(deadEnemies);
        bullets.removeAll(deadBullets);

        Rectangle playerBounds = new Rectangle((int) playerX, (int) playerY, PLAYER_SIZE, PLAYER_SIZE);
        for (Enemy en : enemies) {
            if (playerBounds.intersects(en.bounds())) {
                gameOver = true;
            }
        }

        if (frameCount % 60 == 0) score += 1;

        for (Star s : stars) {
            s.y += s.speed;
            if (s.y > HEIGHT) {
                s.y = 0;
                s.x = rand.nextInt(WIDTH);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.WHITE);
        for (Star s : stars) {
            g2.fillOval((int) s.x, (int) s.y, 2, 2);
        }

        g2.setColor(Color.YELLOW);
        for (Bullet b : bullets) {
            g2.fillRect((int) b.x - 2, (int) b.y - 8, 4, 16);
        }

        g2.setColor(Color.RED);
        for (Enemy en : enemies) {
            g2.fillRect((int) en.x, (int) en.y, (int) en.size, (int) en.size);
        }

        g2.setColor(Color.CYAN);
        int[] xs = {
                (int) (playerX + PLAYER_SIZE / 2.0),
                (int) playerX,
                (int) (playerX + PLAYER_SIZE)
        };
        int[] ys = {
                (int) playerY,
                (int) (playerY + PLAYER_SIZE),
                (int) (playerY + PLAYER_SIZE)
        };
        g2.fillPolygon(xs, ys, 3);

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Monospaced", Font.BOLD, 20));
        g2.drawString("Score: " + score, 15, 30);

        if (gameOver) {
            g2.setColor(new Color(0, 0, 0, 180));
            g2.fillRect(0, 0, WIDTH, HEIGHT);

            g2.setColor(Color.WHITE);
            g2.setFont(new Font("Monospaced", Font.BOLD, 32));
            String msg = "GAME OVER";
            FontMetrics fm = g2.getFontMetrics();
            g2.drawString(msg, (WIDTH - fm.stringWidth(msg)) / 2, HEIGHT / 2 - 30);

            g2.setFont(new Font("Monospaced", Font.PLAIN, 18));
            fm = g2.getFontMetrics();
            String scoreMsg = "Final score: " + score;
            g2.drawString(scoreMsg, (WIDTH - fm.stringWidth(scoreMsg)) / 2, HEIGHT / 2 + 5);

            String restartMsg = "Press ENTER to play again";
            fm = g2.getFontMetrics();
            g2.drawString(restartMsg, (WIDTH - fm.stringWidth(restartMsg)) / 2, HEIGHT / 2 + 35);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        pressedKeys.add(e.getKeyCode());
        if (gameOver && e.getKeyCode() == KeyEvent.VK_ENTER) {
            resetGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Star Dodger");
            StarDodger game =  new StarDodger();
            frame.add(game);
            frame.pack();
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            game.requestFocusInWindow();
        });
    }
}
