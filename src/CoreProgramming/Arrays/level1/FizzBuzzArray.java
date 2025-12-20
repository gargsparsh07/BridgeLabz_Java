package CoreProgramming.Arrays.level1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) return;

        String[] result = new String[number + 1];

        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) result[i] = "FizzBuzz";
            else if (i % 3 == 0) result[i] = "Fizz";
            else if (i % 5 == 0) result[i] = "Buzz";
            else result[i] = String.valueOf(i);
        }

        for (int i = 1; i <= number; i++)
            System.out.println("Position " + i + " = " + result[i]);
    }
}