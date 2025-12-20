package CoreProgramming.Arrays.level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                System.out.println(arr[i] + " is positive and " +
                        (arr[i] % 2 == 0 ? "even" : "odd"));
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (arr[0] == arr[4])
            System.out.println("First and last elements are equal");
        else if (arr[0] > arr[4])
            System.out.println("First element is greater");
        else
            System.out.println("Last element is greater");
    }
}
