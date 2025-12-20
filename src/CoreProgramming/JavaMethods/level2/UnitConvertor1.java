package CoreProgramming.JavaMethods.level2;

public class UnitConvertor1 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("5 miles to km: " + convertMilesToKm(5));
        System.out.println("2 meters to feet: " + convertMetersToFeet(2));
        System.out.println("6 feet to meters: " + convertFeetToMeters(6));
    }
}
