package CoreProgramming.Arrays.level2;

import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar","Akbar","Anthony"};

        System.out.println("Enter age and height of Amar, Akbar, Anthony:");
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}