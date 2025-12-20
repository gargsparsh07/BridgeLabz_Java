package CoreProgramming.ExtraJavaString;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter new word:");
        String newWord = sc.nextLine();

        String result = sentence.replace(oldWord, newWord);

        System.out.println("Updated Sentence: " + result);
    }
}
