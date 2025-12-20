package CoreProgramming.JavaMethods.level2;

import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(isEven(numbers[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.println(result == 0 ? "Equal" : result > 0 ? "First Greater" : "Last Greater");
    }
}
