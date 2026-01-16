package CoreProgramming.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num) { super(num, 2000); }
    public double calculateRentalCost(int days) { return rentalRate * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}

class Bike extends Vehicle {
    public Bike(String num) { super(num, 800); }
    public double calculateRentalCost(int days) { return rentalRate * days; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num) { super(num, 4000); }
    public double calculateRentalCost(int days) { return rentalRate * days; }
    public double calculateInsurance() { return 1500; }
    public String getInsuranceDetails() { return "Truck Insurance"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("CAR101"),
                new Bike("BIKE202"),
                new Truck("TRK303")
        );

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: ₹" + v.calculateRentalCost(3));
        }
    }
}
