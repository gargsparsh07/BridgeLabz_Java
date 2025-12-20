package CoreProgramming.JavaMethods.level3;

import java.util.Arrays;

public class FactorAnalysis {

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int num) {

        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        // Second loop to store factors
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    // Method to find greatest factor using factors array
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;

        for (int factor : factors) {
            if (factor > max)
                max = factor;
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if number is Perfect
    public static boolean isPerfect(int num, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != num)
                sum += factor;
        }
        return sum == num;
    }

    // Method to check if number is Abundant
    public static boolean isAbundant(int num, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != num)
                sum += factor;
        }
        return sum > num;
    }

    // Method to check if number is Deficient
    public static boolean isDeficient(int num, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != num)
                sum += factor;
        }
        return sum < num;
    }

    // Method to check if number is Strong Number
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Helper method to find factorial
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method
    public static void main(String[] args) {

        int number = 28;

        int[] factors = findFactors(number);

        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        System.out.println("Is Perfect Number? " + isPerfect(number, factors));
        System.out.println("Is Abundant Number? " + isAbundant(number, factors));
        System.out.println("Is Deficient Number? " + isDeficient(number, factors));

        System.out.println("Is Strong Number? " + isStrong(number));
    }
}
