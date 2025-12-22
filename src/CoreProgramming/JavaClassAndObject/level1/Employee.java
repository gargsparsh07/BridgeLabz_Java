package CoreProgramming.JavaClassAndObject.level1;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Details");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee();
        emp.name = name;
        emp.id = id;
        emp.salary = salary;

        emp.displayDetails();
    }
}
