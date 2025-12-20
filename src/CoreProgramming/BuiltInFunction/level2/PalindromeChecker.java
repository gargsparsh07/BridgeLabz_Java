package CoreProgramming.BuiltInFunction.level2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("It is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equalsIgnoreCase(rev);
    }
}
