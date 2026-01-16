package Object_oriented_programming.JavaClassAndObject.level1;

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItem(int quantity) {
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Item Details");
        System.out.print("Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Item Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        Item i = new Item();
        i.itemCode = code;
        i.itemName = name;
        i.price = price;

        i.displayItem(qty);
    }
}
