package CoreProgramming.Arrays.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int[] digits = new int[20];
        int count = 0;

        while (num != 0) {
            digits[count++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++)
            System.out.print(digits[i]);
    }
}
