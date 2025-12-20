package CoreProgramming.ControlFlow.level1;

import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        int sumLoop = 0, i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;
        System.out.println("While Loop Sum: " + sumLoop);
        System.out.println("Formula Sum: " + sumFormula);

        sc.close();
    }
}