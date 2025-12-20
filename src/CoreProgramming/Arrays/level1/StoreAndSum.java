package CoreProgramming.Arrays.level1;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            arr[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Sum = " + total);
    }
}
