package CoreProgramming.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

import java.util.*;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public void displayFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        double finalPrice = price + tax - calculateDiscount();
        System.out.println(name + " → Final Price: ₹" + finalPrice);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.20; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Electronics(1, "Laptop", 60000),
                new Clothing(2, "Shirt", 2000),
                new Groceries(3, "Rice", 1000)
        );

        for (Product p : products) {
            p.displayFinalPrice();
        }
    }
}
