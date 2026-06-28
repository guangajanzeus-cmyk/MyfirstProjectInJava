import java.util.Scanner;
public class Main2 {
    // ThIS IS MY FIRST JAVA PROGRAM
    public
    static void main(String[] args) {
        //Shopping Cart Program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '₱';
        double total;

        System.out.print("What would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();

        System.out.print("how many item would you like to buy: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "'s");
        System.out.println("Your total is " + currency + total);



        //if statement


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

        if (name.isEmpty()){
            System.out.println("\nYou DIDN'T enter your name! 😡");
        }
        else {
            System.out.println("\nHello " + name + " 😉");
        }

        //Group 2

        if (age >= 65){
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
        }
        else {
            System.out.println("You're NOT a student from TCNHS! 🚫");
        }

        scanner.close();
    }
}