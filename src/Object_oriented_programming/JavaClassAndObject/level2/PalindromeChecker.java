package Object_oriented_programming.JavaClassAndObject.level2;

import java.util.Scanner;

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equalsIgnoreCase(rev);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is NOT a Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to Check Palindrome");
        String input = sc.nextLine();

        PalindromeChecker p = new PalindromeChecker();
        p.text = input;

        p.displayResult();
    }
}
