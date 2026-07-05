import java.util.Scanner;
import java.util.Random;
public class Main2 {
    // ThIS IS MY FIRST JAVA PROGRAM
    public
    static void main(String[] args) {
        //if statement

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("\nHow old are you: ");
        age = scanner.nextInt();

        System.out.print("Are you a student from TCNHS: ");
        isStudent = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();


        //Group 1

        if (name.isEmpty()) {
            System.out.println("\nYou DIDN'T enter your name! 😡");
        } else {
            System.out.println("\nHello " + name + " 😉");
        }

        //Group 2

        if (age >= 65) {
            System.out.println("You're a senior!👴");
        } else if (age >= 18) {
            System.out.println("You're a adult! 🧑");
        } else if (age == 0) {
            System.out.println("You are a baby! 👶");
        } else if (age < 0) {
            System.out.println("You haven't born yet 😇");
        } else {
            System.out.println("You're a teenager! 👦");
        }

        //Group 3

        if (isStudent) {
            System.out.println("You're a Student! 🏫");
        } else {
            System.out.println("You're NOT a student from TCNHS! 🚫");
        }

        scanner.close();

        Random random = new Random();

        int numbers;

        numbers = random.nextInt(1, 11);

        System.out.println(numbers);

        double number1;

        number1 = random.nextDouble();

        System.out.println(number1);

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails!");
        }
    }
}