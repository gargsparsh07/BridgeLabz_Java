package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class SplitTextCompare {

    static String[] splitUsingCharAt(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ')
                count++;

        String[] words = new String[count];
        int index = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = splitUsingCharAt(text);
        String[] builtIn = text.split(" ");

        System.out.println(compareArrays(custom, builtIn));
    }
}
