package CoreProgramming.JavaMethods.level2;

import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();
            System.out.println(checker.canStudentVote(age) ? "Can Vote" : "Cannot Vote");
        }
    }
}
