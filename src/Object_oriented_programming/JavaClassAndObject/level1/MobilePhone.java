package Object_oriented_programming.JavaClassAndObject.level1;

import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayPhone() {
        System.out.println("\n--- Mobile Phone Details ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile Phone Details");
        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        MobilePhone m = new MobilePhone();
        m.brand = brand;
        m.model = model;
        m.price = price;

        m.displayPhone();
    }
}
