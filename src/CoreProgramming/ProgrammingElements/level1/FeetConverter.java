package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class FeetConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in feet is " + feet +
                " while in yards is " + yards +
                " and miles is " + miles);

        sc.close();
    }
}
