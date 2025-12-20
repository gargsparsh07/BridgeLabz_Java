package CoreProgramming.ControlFlow.level1;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        boolean isSmallest = (a < b && a < c);

        System.out.println("Is the first number the smallest? " + isSmallest);
        sc.close();
    }
}
