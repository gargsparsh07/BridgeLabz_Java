package Object_oriented_programming.JavaClassAndObject.level2;

import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Not enough items to remove");
    }

    void displayTotal() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartItem c = new CartItem();

        System.out.println("Enter Cart Item Details");
        System.out.print("Item Name: ");
        c.itemName = sc.nextLine();

        System.out.print("Price: ");
        c.price = sc.nextDouble();

        System.out.print("Add Quantity: ");
        c.addItem(sc.nextInt());

        System.out.print("Remove Quantity: ");
        c.removeItem(sc.nextInt());

        c.displayTotal();
    }
}
