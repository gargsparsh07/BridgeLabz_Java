package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class ShortestLongestWord {

    static int[] findMinMax(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = min;

        for (String[] row : data) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(words[i].length());
        }

        int[] result = findMinMax(table);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
    }
}
