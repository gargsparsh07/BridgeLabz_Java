package CoreProgramming.BuiltInFunction.level2;

import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
