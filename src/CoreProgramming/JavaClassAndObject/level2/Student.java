package CoreProgramming.JavaClassAndObject.level2;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "Fail";
    }

    void displayStudent() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name  : " + name);
        System.out.println("Roll  : " + rollNumber);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Details");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Marks: ");
        int marks = sc.nextInt();

        Student s = new Student();
        s.name = name;
        s.rollNumber = roll;
        s.marks = marks;

        s.displayStudent();
    }
}
