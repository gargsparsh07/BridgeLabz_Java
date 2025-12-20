package CoreProgramming.JavaMethods.level3;

import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle
    public static boolean isCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );

        return area == 0;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Slope method
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Area method
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Method:");
        System.out.println("Are points collinear? " + slopeResult);

        System.out.println("\nUsing Area of Triangle Method:");
        System.out.println("Are points collinear? " + areaResult);

        sc.close();
    }
}

