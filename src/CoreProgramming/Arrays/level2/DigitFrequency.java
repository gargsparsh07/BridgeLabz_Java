package CoreProgramming.Arrays.level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int[] freq = new int[10];
        while (num != 0) {
            freq[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++)
            System.out.println(i + " -> " + freq[i]);
    }
}