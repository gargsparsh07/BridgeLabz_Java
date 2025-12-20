package CoreProgramming.JavaMethods.level1;

import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int result = checkNumber(number);

        if (result == 1)
            System.out.println("Positive Number");
        else if (result == -1)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}
