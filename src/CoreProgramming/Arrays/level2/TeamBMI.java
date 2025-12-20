package CoreProgramming.Arrays.level2;

import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();

        double[] w = new double[n], h = new double[n], bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble();
            h[i] = sc.nextDouble() / 100;
            bmi[i] = w[i] / (h[i] * h[i]);

            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++)
            System.out.println(w[i] + " " + h[i] + " " + bmi[i] + " " + status[i]);
    }
}
