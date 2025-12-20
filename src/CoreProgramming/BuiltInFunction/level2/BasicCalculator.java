package CoreProgramming.BuiltInFunction.level2;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(a, b));
                break;
            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;
            case 4:
                System.out.println("Result: " + divide(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
