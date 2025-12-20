package CoreProgramming.JavaMethods.level2;

import java.util.Scanner;

public class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) return new double[]{};

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return delta == 0 ? new double[]{root1} : new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        for (double r : roots) System.out.println("Root: " + r);
    }
}
