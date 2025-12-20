package CoreProgramming.JavaMethods.level2;

import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumUsingRecursion(int n) {
        if (n == 0) return 0;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);
    }
}
