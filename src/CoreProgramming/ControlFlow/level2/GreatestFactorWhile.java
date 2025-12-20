package CoreProgramming.ControlFlow.level2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int i = number - 1;
        while (i >= 1) {
            if (number % i == 0) {
                System.out.println("Greatest Factor: " + i);
                break;
            }
            i--;
        }
    }
}
