import java.util.Scanner;
public class Main2 {
    // ThIS IS MY FIRST JAVA PROGRAM
    public
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or a person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ate (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nThe " + adjective1 + " " + "and " + adjective2);
        System.out.println("student saw a " + adjective3 + " laptop while trying to " + verb);
        System.out.println("a " + noun1 + " " + "for his project, but he stayed focused because he wanted to improve!");

        scanner.close();
    }
}