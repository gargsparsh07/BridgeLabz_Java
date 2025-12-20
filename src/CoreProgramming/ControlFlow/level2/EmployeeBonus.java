package CoreProgramming.ControlFlow.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = (years > 5) ? salary * 0.05 : 0;
        System.out.println("Bonus Amount is INR " + bonus);
    }
}
