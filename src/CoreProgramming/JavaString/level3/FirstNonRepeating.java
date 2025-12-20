package CoreProgramming.JavaString.level3;

import java.util.Scanner;

class FirstNonRepeating {

    // Method to find first non-repeating character
    static char findFirstNonRepeating(String text) {

        int[] freq = new int[256];   // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';   // No non-repeating character
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
