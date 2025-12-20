package CoreProgramming.JavaString.level3;

import java.util.Scanner;

class FrequencyUsingUnique {

    public static char[] unique(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                temp[index++] = text.charAt(i);
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] uniqueChars = unique(text);
        System.out.println("Character\tFrequency");
        for (char c : uniqueChars)
            System.out.println(c + "\t\t" + freq[c]);
    }
}
