import java.util.Scanner;
public class Main {
    // ThIS IS MY FIRST JAVA PROGRAM
    static void main(String[] args) {
        System.out.println("I'm not broke, I'm just a broken hearted man");
        System.out.println("I know it makes no sense but what else can I do");
        System.out.println("How can I move on when I'm still in love with you");
        System.out.println();

        int age = 17;
        int year = 2026;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);
        System.out.println();
        System.out.println("The Year is: " + year);
        System.out.println();

        double price = 700.5;
        double gpa = 3.5;
        double temperature = 36.7;

        System.out.println("Mechanical Keyboard G-61: " + "₱" + price);
        System.out.println("class gpa: " + gpa);
        System.out.println("Philippines Temperature: " + temperature);
        System.out.println();

        char grade = 'A';
        char symbol = '?';
        char currency = '₱';

        System.out.println("Grade Last Year: " + grade);
        System.out.println("Favourite Symbol: " + symbol);
        System.out.println("Philippines Currency: " + currency);
        System.out.println();

        boolean isJan = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isJan);
        System.out.println(forSale);
        System.out.println(isOnline);

        if (isOnline) {
            System.out.println("Play With us");
        } else {
            System.out.println("Jan Is Offline");
        }
        if (forSale) {
            System.out.println("It's only ₱3");
        } else {
            System.out.println("Ice Is SOLD OUT!");
        }
        if (isJan) {
            System.out.println("Congrats You Meet Jan");
        } else {
            System.out.println("Sorry You Don't Know Him");
        }
        System.out.println();

        String name = "Jan";
        String food = "Steak";
        String School = "TCHNS";
        String email = "guangajanzeus@gmail.com";
        String car = "Porsche 911 GT2RS";
        String color = "Purple";

        System.out.println("Hello " + name);
        System.out.println("My Favourite Food: " + food);
        System.out.println("My School: " + School);
        System.out.println("My Email Is: " + email);
        System.out.println("My Favourite Car is: " + car);
        System.out.println("Red + Blue = " + color);

        System.out.println("My favourite car is: " + color + " " + car);
        if (forSale) {
            System.out.println("the " + car + " " + "is for sale");
        } else {
            System.out.println("the " + car + " " + "is not for sale");
        }

        String name1 = "Jan Zeus M. Guanga";
        int callOfDuty = 4;
        double pi = 3.14 ;
        char gender1 = 'M';
        boolean isAdmin = true;

        System.out.println("My name is " + name + " " + "and my favourite offline game is " + callOfDuty + " " + "and the pi is " + pi + " " +  "and yeah my sex is " + gender1);
        if (isAdmin) {
            System.out.print("You can go inside in school");
        } else {
            System.out.println("Bring Your ID");
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name2 = scanner.nextLine();

        System.out.print("What year did you born: ");
        int age3 = scanner.nextInt();

        System.out.print("What is the value of pi:");
        double p3 = scanner.nextDouble();

        System.out.print("Are you interested in me? (true/false): ");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello :) " + name2);
        System.out.println("ohh shii, " + age3 + " " + "that's cool");
        System.out.println("The value of pi is " + p3);
        if (student) {
            System.out.println("Wow that's cool");
        }
        else {
            System.out.println("That's what I am talking about! :)");
        }

        double width = 0;
        double height = 0;
        double area = 0;


        System.out.println("INSTRUCTION:you can multiply the area of rectangle or even calculate anything yeah ofcourse its multiply only");

        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the Height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.print("The Area of the rectangle is: " + area + " " + "cm² \n");

        scanner.nextLine();

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

        System.out.println("\nThe " + adjective1  + " and " + adjective2);
        System.out.println("student saw a " + adjective3 + " laptop while trying to " + verb);
        System.out.println("a " + noun1  + " for his project, but he stayed focused because he wanted to improve!");


        scanner.close();

        int x = 10;
        int y = 3;
        //int z;
       // z = x * y;
       // z = x + y;
        //z = x - y;
        //z = x / y;
        //z = x % y;
        //x = x * y;

        //x++;
       // x--;

        //x += 1;
        //x *= 1;
        //x -= 1;
        //x /= 1;
        //x %= 3;

        double result = 2 + 2 * (7-2) / 2.0;

        System.out.println(result);

        boolean isStudent = true;
        boolean isSenior = true;
        double price2 = 599;

        if (isStudent){
            if (isSenior){
                System.out.println("You get a senior discount for 20%");
                System.out.println("You get a student discount for 10%");
                price2 *= 0.7;
            }
            else {
                System.out.println("You get a student discount for 10%");
                price2 *= 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount for 20%");
                price2 *= 0.8;
            }
            else {
                price2 *= 1;
            }
        }
        System.out.printf("The price of the ticket is: ₱%.2f", price2);
    }
}
