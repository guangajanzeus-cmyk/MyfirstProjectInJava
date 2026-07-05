import java.util.Scanner;
public static class CompoundInterestCalculator {
}
static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompounded;
    int year;
    double Amount;

    System.out.print("Enter the Principal Amount: ");
    principal = scanner.nextDouble();

    System.out.print("Enter the interest (in %): ");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the # of the times compounded per year: ");
    timesCompounded = scanner.nextInt();

    System.out.print("Enter the # of years: ");
    year = scanner.nextInt();

    Amount = principal * Math.pow(1 + rate/ timesCompounded, timesCompounded * year);

    System.out.printf("The amount after %d years is ₱%.2f", year, Amount);

    scanner.close();


}
