package CoreProgramming.JavaString.level3;

import java.util.Scanner;

class UniqueCharacters {

    // Method to find unique characters
    static char[] findUniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index] = current;
                index++;
            }
        }

        // Copy exact size result
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method to display result
    static void display(char[] data) {

        System.out.print("Unique characters are: ");
        for (char c : data) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        display(uniqueChars);
    }
}
