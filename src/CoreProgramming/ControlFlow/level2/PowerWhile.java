package CoreProgramming.ControlFlow.level2;

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1, count = 0;
        while (count < power) {
            result *= number;
            count++;
        }

        System.out.println("Result = " + result);
    }
}
