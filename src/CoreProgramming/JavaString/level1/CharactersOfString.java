package CoreProgramming.JavaString.level1;

import java.util.Scanner;

class CharactersOfString {

    static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Arrays Equal: " +
                compareArrays(customArray, builtInArray));
    }
}
