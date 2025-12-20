package CoreProgramming.ProgrammingElements.level2;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        double kg = pounds / 2.2;

        System.out.println("The weight of the person in pound is " +
                pounds + " and in kg is " + kg);

        sc.close();
    }
}
