package CoreProgramming.this_static_final_key_words_and_instance_of_operator;

class Product {
    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        System.out.println(productName + " | ID: " + productID);
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 60000, 1, 1001);

        if (p instanceof Product) {
            p.display();
        }

        Product.updateDiscount(15);
        System.out.println("Discount: " + discount + "%");
    }
}
