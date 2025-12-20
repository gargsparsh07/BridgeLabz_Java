package CoreProgramming.ControlFlow.level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, num;

        while (true) {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextDouble();
            if (num == 0)
                break;
            total += num;
        }
        System.out.println("Sum is " + total);
        sc.close();
    }
}
