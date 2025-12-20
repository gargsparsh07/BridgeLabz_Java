package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class TrimSpaces {

    static String customTrim(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++)
            result += text.charAt(i);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String custom = customTrim(text);
        String builtIn = text.trim();

        System.out.println("Same Result: " + custom.equals(builtIn));
    }
}
