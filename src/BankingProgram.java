import java.sql.SQLOutput;
import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args){

         //JAVA BANKING PROGRAM

         double balance = 0;
         boolean isRunning = true;
         int choice;

         while (isRunning) {


             System.out.println("***************");
             System.out.println("BANKING PROGRAM");
             System.out.println("***************");
             System.out.println("1. ShowBalance");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
             System.out.println("4. Exit");
             System.out.println("***************");


             System.out.print("Enter your choice 1-4: ");
             choice = scanner.nextInt();

             switch (choice) {
                 case 1 -> ShowBalance(balance);
                 case 2 -> balance += deposit();
                 case 3 -> balance -= withDraw(balance);
                 case 4 -> isRunning = false;

                 default -> System.out.println("INVALID CHOICE");
             }
         }
         System.out.println("***************");
         System.out.println("Have a Nice Day!");
         System.out.println("***************");
    }
    static void ShowBalance(double balance) {
        System.out.println("***************");
        System.out.printf("₱%.2f\n", balance);
    }
    static double deposit() {

         double amount;

        System.out.print("Enter the amount deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be NEGATIVE!");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withDraw(double balance){

         double amount;

        System.out.print("Enter the amount to Withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount can't be NEGATIVE");
            return 0;
        }
        else {
            return amount;
        }
    }
}
