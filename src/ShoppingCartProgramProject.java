
import java.util.Scanner;
public class ShoppingCartProgramProject {
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
        System.out.printf("Your total is %c%,.1f\n", currency, total);
    }
}
