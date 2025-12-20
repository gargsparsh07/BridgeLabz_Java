package CoreProgramming.JavaMethods.level1;

import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum handshakes possible: " + handshakes);
    }
}
