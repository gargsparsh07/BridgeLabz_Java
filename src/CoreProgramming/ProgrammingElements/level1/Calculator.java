package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter integer 2: ");
        double num2 = sc.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + num1 + " and " + num2 + " is "
                + (num1 + num2) + ", "
                + (num1 - num2) + ", "
                + (num1 * num2) + ", "
                + (num1 / num2));

        sc.close();
    }
}