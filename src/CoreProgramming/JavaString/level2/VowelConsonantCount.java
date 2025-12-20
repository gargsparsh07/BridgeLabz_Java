package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class VowelConsonantCount {

    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;

        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String res = checkChar(text.charAt(i));
            if (res.equals("Vowel")) v++;
            else if (res.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] result = countVC(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
