package CoreProgramming.JavaMethods.level3;

import java.util.Arrays;

public class HarshadChecker {

    // Method to find count of digits
    public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to store digits of number in an array
    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad Number
    public static boolean isHarshad(int num) {
        int[] digits = getDigitsArray(num);
        int sum = sumOfDigits(digits);

        return num % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    // Main method
    public static void main(String[] args) {

        int number = 21;

        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquaresOfDigits(digits);
        int[][] frequency = digitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + squareSum);
        System.out.println("Is Harshad Number? " + isHarshad(number));

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "        " + frequency[i][1]);
            }
        }
    }
}
