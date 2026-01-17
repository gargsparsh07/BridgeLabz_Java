package Object_oriented_programming.JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("\n--- Car Rental Details ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Rahul", "Swift", 4);
        c.display();
    }
}
