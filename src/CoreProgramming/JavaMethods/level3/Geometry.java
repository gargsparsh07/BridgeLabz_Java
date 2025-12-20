package CoreProgramming.JavaMethods.level3;

import java.util.Scanner;

public class Geometry {

    // Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }

    // Method to find slope (m) and y-intercept (b)
    // Returns array: [m, b]
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - (m * x1);          // y-intercept

        return new double[]{m, b};
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Input second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = findDistance(x1, y1, x2, y2);

        // Find equation of line
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Y-intercept (b) = " + line[1]);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}
