package CoreProgramming.ControlFlow.level3;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        String grade, remarks;

        if (average >= 80) { grade = "A"; remarks = "Excellent"; }
        else if (average >= 70) { grade = "B"; remarks = "Very Good"; }
        else if (average >= 60) { grade = "C"; remarks = "Good"; }
        else if (average >= 50) { grade = "D"; remarks = "Average"; }
        else if (average >= 40) { grade = "E"; remarks = "Poor"; }
        else { grade = "R"; remarks = "Remedial"; }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}

