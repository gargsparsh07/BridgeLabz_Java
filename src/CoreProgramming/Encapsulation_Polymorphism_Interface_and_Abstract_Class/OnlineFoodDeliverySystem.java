interface Discountable {
    double applyDiscount();
}

abstract class FoodItem {
    protected double price;
    protected int quantity;

    public FoodItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(double p, int q) { super(p, q); }
    public double calculateTotalPrice() { return price * quantity; }
}

class NonVegItem extends FoodItem {
    public NonVegItem(double p, int q) { super(p, q); }
    public double calculateTotalPrice() { return (price + 50) * quantity; }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item = new NonVegItem(200, 2);
        System.out.println(item.calculateTotalPrice());
    }
}
