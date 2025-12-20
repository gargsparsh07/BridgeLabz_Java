package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in integer: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet + " and inches is " + remainingInches);

        sc.close();
    }
}
