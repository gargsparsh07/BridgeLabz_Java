package CoreProgramming.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

abstract class RideVehicle {
    protected double ratePerKm;
    public abstract double calculateFare(double distance);
}

class CarRide extends RideVehicle {
    public CarRide() { ratePerKm = 15; }
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class BikeRide extends RideVehicle {
    public BikeRide() { ratePerKm = 8; }
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

class AutoRide extends RideVehicle {
    public AutoRide() { ratePerKm = 12; }
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

public class RideHailingSystem {
    public static void main(String[] args) {
        RideVehicle ride = new CarRide();
        System.out.println(ride.calculateFare(10));
    }
}
