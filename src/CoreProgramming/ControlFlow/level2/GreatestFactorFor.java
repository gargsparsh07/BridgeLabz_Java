package CoreProgramming.ControlFlow.level2;

import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println("Greatest Factor: " + i);
                break;
            }
        }
    }
}
