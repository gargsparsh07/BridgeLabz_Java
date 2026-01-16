package CoreProgramming.LinkedList;

import java.util.Scanner;

class StudentNode {
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    // Add at beginning
    void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning.");
    }

    // Add at end
    void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        System.out.println("Student added at end.");
    }

    // Add at specific position
    void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos <= 0) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < pos && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Student added at position " + pos);
    }

    // Delete by Roll Number
    void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == roll) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != roll)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted.");
        }
    }

    // Search by Roll Number
    void search(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Found Student:");
                System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update Grade
    void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all students
    void display() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                    temp.rollNo + " | " +
                            temp.name + " | " +
                            temp.age + " | " +
                            temp.grade
            );
            temp = temp.next;
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll No");
            System.out.println("5. Search by Roll No");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addAtBeginning(
                            sc.nextInt(), sc.next(), sc.nextInt(), sc.next()
                    );
                    break;

                case 2:
                    list.addAtEnd(
                            sc.nextInt(), sc.next(), sc.nextInt(), sc.next()
                    );
                    break;

                case 3:
                    list.addAtPosition(
                            sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next()
                    );
                    break;

                case 4:
                    list.deleteByRoll(sc.nextInt());
                    break;

                case 5:
                    list.search(sc.nextInt());
                    break;

                case 6:
                    list.updateGrade(sc.nextInt(), sc.next());
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
