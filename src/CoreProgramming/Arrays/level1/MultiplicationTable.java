package CoreProgramming.Arrays.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}

