package Object_oriented_programming.ObjectOrientedDesignPrinciples.SelfProblems;

import java.util.*;

class Product {
    String name;
    Product(String name) {
        this.name = name;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order");
    }

    public static void main(String[] args) {
        Customer c = new Customer("Amit");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));

        c.placeOrder(o);
    }
}
