package CoreProgramming.JavaString.level3;

import java.util.Scanner;

class FrequencyNested {

    public static void frequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        System.out.println("Character\tFrequency");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0')
                System.out.println(chars[i] + "\t\t" + freq[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        frequency(text);
    }
}
