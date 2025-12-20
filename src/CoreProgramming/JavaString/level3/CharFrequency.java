package CoreProgramming.JavaString.level3;

import java.util.Scanner;

class CharFrequency {

    static void frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        System.out.println("Character\tFrequency");

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                System.out.println(ch + "\t\t" + freq[ch]);
                freq[ch] = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        frequency(text);
    }
}
