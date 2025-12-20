package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Unit Price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Your quantity is: " );
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);

        sc.close();
    }
}
