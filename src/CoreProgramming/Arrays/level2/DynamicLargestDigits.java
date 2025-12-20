package CoreProgramming.Arrays.level2;

import java.util.Scanner;

public class DynamicLargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int max = 10, index = 0;
        int[] digits = new int[max];

        while (num != 0) {
            if (index == max) {
                max += 10;
                int[] temp = new int[max];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
