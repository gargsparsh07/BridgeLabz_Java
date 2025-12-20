package CoreProgramming.JavaMethods.level3;

import java.util.Arrays;

public class PalindromeChecker {

    // Method to count digits in a number
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

    // Method to reverse digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Method to check if number is Palindrome using digits
    public static boolean isPalindrome(int num) {
        int[] original = getDigitsArray(num);
        int[] reversed = reverseArray(original);

        return compareArrays(original, reversed);
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

    // Main method
    public static void main(String[] args) {

        int number = 121;

        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));

        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Array: " + Arrays.toString(reversedDigits));

        System.out.println("Arrays Equal? " + compareArrays(digits, reversedDigits));
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuck(number));
    }
}
