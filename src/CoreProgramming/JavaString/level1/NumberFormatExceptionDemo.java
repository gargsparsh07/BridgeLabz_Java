package CoreProgramming.JavaString.level1;

import java.util.Scanner;

class NumberFormatExceptionDemo {

    static void generateException(String text) {
        int num = Integer.parseInt(text);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
