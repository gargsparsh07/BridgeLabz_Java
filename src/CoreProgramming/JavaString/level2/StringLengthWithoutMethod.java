package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class StringLengthWithoutMethod {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println("Custom Length: " + findLength(text));
        System.out.println("Built-in Length: " + text.length());
    }
}
