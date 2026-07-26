import java.util.Scanner;

public class InventoryManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;
        String add = " \n " + "\n";
        String viewProducts = "Technics\n" +
                "\n" +
                "TechDeck\n" +
                "\n" +
                "TechPad\n" +
                "\n" +
                "TechGrip\n" +
                "\n" +
                "Techcam\n" +
                "\n" +
                "TechKey\n" +
                "\n" +
                "TechMat\n" +
                "\n" +
                "TechBot\n" +
                "\n" +
                "TechSuit\n" +
                "\n" +
                "TechPen\n";
        String removeProducts;
        String searchProduct = "";

        while (isRunning) {
            System.out.println("=======INVENTORY=======");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Search Product");
            System.out.println("5. Exit");

            System.out.print("Enter your Choice 1-5:");
            choice = scanner.nextInt();


            switch (choice) {
                case 1 -> view(viewProducts);
                case 2 -> viewProducts += Add();
                case 3 -> viewProducts = viewProducts.replace(remove(viewProducts), "");
                case 4 -> search(searchProduct);
                case 5 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("=================");
        System.out.println("Inventory Closed.");
        System.out.println("=================");

    }


    static void view(String viewProducts ) {
    System.out.println("=================");
    System.out.println(viewProducts);
    System.out.println("=================");
}
static String Add() {

        String adds;

    System.out.println("\n=================");
    System.out.print("Enter the product you want to add: ");
    scanner.nextLine();
    adds = scanner.nextLine();

    System.out.println();

    if (adds.isEmpty()) {
        System.out.print("Enter the Product.");
        return "\n";
    }
     else if (adds == adds) {
        System.out.println("Already input the product");
        return "\n";
    } else {
        System.out.println("Product Added Successfully!");
       return "\n" + adds;

    }

}
static String remove(String viewProducts) {

        String remove;

    System.out.print("Enter the product you want to remove: ");
    scanner.nextLine();
    remove = scanner.nextLine();

    if (remove == viewProducts) {
        System.out.println("INVALID PRODUCT YOU WANT TO REMOVE!");
        return "";
    }
    else if (remove.contains("!,@,#,$,%,^,&,*,(,)")) {
        System.out.println("Letters only");
    }
    else {
        System.out.println("Product Remove Successfully!");
        return remove;
    }

    return remove;
}
static String search (String viewProducts){

        String search;

    System.out.print("Enter the product you searching for: ");
    scanner.nextLine();
    search = scanner.nextLine();

    if (search != viewProducts) {
        System.out.println("PRODUCT FOUND!!!");
        System.out.println(search);
    }
    else {
        System.out.println("PRODUCT NOT FOUND.");
    }

        return "";
}
}
