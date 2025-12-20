package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class WordsWithLength {

    static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitText(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ')
                count++;

        String[] words = new String[count];
        int idx = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = temp;
                temp = "";
            } else temp += text.charAt(i);
        }
        words[idx] = temp;
        return words;
    }

    static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = wordLengthTable(splitText(text));

        for (String[] row : result)
            System.out.println(row[0] + " : " + row[1]);
    }
}
