package CoreProgramming.JavaMethods.level2;

import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter weight and height: ");
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);
            System.out.println("BMI: " + bmi + " Status: " + bmiStatus(bmi));
        }
    }
}
