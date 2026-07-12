import java.util.Scanner;

public class WEIGHTCONVPROGRAM {
}
 static void main(String[] args) {

    //WEIGHT CONVERSION PROGRAM

     Scanner scanner = new Scanner(System.in);

     double weight;
     double newWeight;
     int choice;

     System.out.println("Weight Conversion Progam");
     System.out.println("1: convert lbs to kgs");
     System.out.println("2: convert kgs to lbs");

     System.out.print("Choose an option:" );
     choice = scanner.nextInt();

     if (choice == 1) {
         System.out.print("Enter the weight in lbs: ");
         weight = scanner.nextDouble();
         newWeight = weight * 0.453592;
         System.out.printf("Your new Weight in kgs is: %.1f",  newWeight);
     }
     else if (choice == 2) {
         System.out.print("Enter the weight in kgs: ");
         weight = scanner.nextDouble();
         newWeight = weight * 2.20462;
         System.out.printf("Your new weight in lbs is: %.1f",  newWeight);

     }

     else {
         System.out.println("that was not a valid choice!");

     }





     Scanner scanner1 = new Scanner(System.in);

     String isLoop;
     double weight1;
     double newWeight1;
     int choice1;

     System.out.print("\nYou want to Convert Again? (YES or NO): ");
     isLoop = scanner1.nextLine();

     if (isLoop.equalsIgnoreCase("YES")) {
        System.out.print("Choose an option:" );
         choice = scanner.nextInt();
         if (choice == 1) {
             System.out.print("Enter the weight in lbs: ");
             weight1 = scanner.nextDouble();
             newWeight1 = weight1 * 0.453592;
             System.out.printf("Your new Weight in kgs is: %.1fkg",  newWeight1);
         }
         else if (choice == 2) {
             System.out.print("Enter the weight in kgs: ");
             weight1 = scanner.nextDouble();
             newWeight1 = weight1 * 2.20462;
             System.out.printf("Your new weight in lbs is: %.1flb",  newWeight1);
         }

         else {
             System.out.println("that was not a valid choice!");
         }

     }
     else {
         System.out.println("please type capital letters");
     }
     scanner1.close();
 }
