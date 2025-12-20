package CoreProgramming.Arrays.level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble(), c = sc.nextDouble(), m = sc.nextDouble();
            percent[i] = (p + c + m) / 3;

            grade[i] = (percent[i] >= 80) ? 'A' :
                    (percent[i] >= 70) ? 'B' :
                            (percent[i] >= 60) ? 'C' :
                                    (percent[i] >= 50) ? 'D' :
                                            (percent[i] >= 40) ? 'E' : 'R';
        }

        for (int i = 0; i < n; i++)
            System.out.println(percent[i] + " " + grade[i]);
    }
}
