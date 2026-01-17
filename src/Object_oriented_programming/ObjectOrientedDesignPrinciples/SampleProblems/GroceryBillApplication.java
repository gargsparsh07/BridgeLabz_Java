package Object_oriented_programming.ObjectOrientedDesignPrinciples.SampleProblems;

import java.util.ArrayList;

// Product class
class GroceryProduct {
    String productName;
    double quantity;
    double pricePerUnit;

    GroceryProduct(String productName, double quantity, double pricePerUnit) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getCost() {
        return quantity * pricePerUnit;
    }
}

// Customer class
class GroceryCustomer {
    String name;
    ArrayList<GroceryProduct> products = new ArrayList<>();

    GroceryCustomer(String name) {
        this.name = name;
    }

    void addProduct(GroceryProduct p) {
        products.add(p);
    }

    void checkout(GroceryBillGenerator bg) {
        bg.generateBill(this);
    }
}

// BillGenerator class
class GroceryBillGenerator {

    void generateBill(GroceryCustomer customer) {
        double total = 0;

        System.out.println("Customer: " + customer.name);

        for (GroceryProduct p : customer.products) {
            double cost = p.getCost();
            total += cost;
            System.out.println(p.productName + " : " + cost);
        }

        System.out.println("Total Bill: $" + total);
    }
}

// Main class
public class GroceryBillApplication {
    public static void main(String[] args) {

        GroceryCustomer customer = new GroceryCustomer("Alice");

        GroceryProduct p1 = new GroceryProduct("Apples", 2, 3);
        GroceryProduct p2 = new GroceryProduct("Milk", 1, 2);

        customer.addProduct(p1);
        customer.addProduct(p2);

        GroceryBillGenerator billGen = new GroceryBillGenerator();
        customer.checkout(billGen);
    }
}
