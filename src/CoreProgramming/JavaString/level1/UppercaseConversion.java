package CoreProgramming.JavaString.level1;

import java.util.Scanner;

class UppercaseConversion {

    static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z')
                result += (char)(c - 32);
            else
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(
                convertToUpper(text).equals(text.toUpperCase())
        );
    }
}
