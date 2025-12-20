package CoreProgramming.ControlFlow.level1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial is " + fact);
        sc.close();
    }
}