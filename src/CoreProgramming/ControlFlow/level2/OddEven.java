package CoreProgramming.ControlFlow.level2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i + (i % 2 == 0 ? " is Even" : " is Odd"));
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
