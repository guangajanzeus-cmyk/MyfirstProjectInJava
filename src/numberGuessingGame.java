import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame {
}
void main() {


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min , max + 1);

    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d\n", min , max );

    do {
        System.out.print("Enter the guess: ");
        guess = scanner.nextInt();
        attempts++;

        if (guess < randomNumber) {
            System.out.println("TOO LOW!, Try Again");
        } else if (guess > randomNumber) {
            System.out.println("TOO HIGH!, Try Again");
        }
        else {
            System.out.println("CORRECT! the number was " + randomNumber);
            System.out.println("# of attemps: " + attempts);
        }
    } while (guess != randomNumber);



    scanner.close();
}
