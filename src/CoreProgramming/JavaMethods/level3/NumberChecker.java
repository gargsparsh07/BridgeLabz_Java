package CoreProgramming.JavaMethods.level3;

import java.util.Arrays;

public class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to store digits of number in array
    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to check if number is Duck Number using digits array
    public static boolean isDuck(int num) {
        int[] digits = getDigitsArray(num);

        for (int digit : digits) {
            if (digit != 0)
                return true;
        }
        return false;
    }

    // Method to check if number is Armstrong using digits array
    public static boolean isArmstrong(int num) {
        int[] digits = getDigitsArray(num);
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    // Method to find largest and second largest digit
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Method to find smallest and second smallest digit
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // Main method
    public static void main(String[] args) {

        int number = 153;

        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuck(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
