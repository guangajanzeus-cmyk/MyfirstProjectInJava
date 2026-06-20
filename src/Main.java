import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    // ThIS IS MY FIRST JAVA PROGRAM
    public static void main(String[] args) {
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
        } else{
            System.out.println("Bring Your ID");
        }
    }
}
