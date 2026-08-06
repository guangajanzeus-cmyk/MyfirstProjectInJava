import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Scanner;
public class MusicPlayer {

    public static void main(String[] args) {

        String FilePath = "src\\Pigstep (AvM Remix) -- Music from Animation vs. Minecraft Ep. 25.wav";
        File file = new File(FilePath);

        try(Scanner scanner = new Scanner(System.in);

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();

            clip.open(audioInputStream);

            clip.start();

            String response = "";


            while (!response.equals("Q")) {

                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");

                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case ("P")->
                    clip.start();
                    case ("S") ->
                    clip.stop();
                    case ("R") ->
                    clip.setMicrosecondPosition(0);
                    case ("Q") ->
                    clip.close();
                    default ->
                    System.out.println("Not a valid response.");
                }
            }

        }
        catch(UnsupportedOperationException e){
            System.out.println("Unsupported operation: " + e.getMessage());
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("An error occurred while accessing the audio file: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Program has ended.");
        }



    }

}
