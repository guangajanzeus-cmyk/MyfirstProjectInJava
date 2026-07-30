import java.util.Scanner;

public class searchAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = {7, 5, 4, 7, 9, 1, 3};
        String[] fruit = {"Apple", "Orange", "Watermelon"};
        boolean isFound = false;
        String target;

        System.out.print("What fruit are you searching for: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not Found in the array");
        }

        scanner.close();

    }
}
