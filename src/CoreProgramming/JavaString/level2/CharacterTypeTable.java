package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class CharacterTypeTable {

    static String getType(char c) {

        if (c >= 'A' && c <= 'Z')
            c = (char)(c + 32);

        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Character\tType");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t\t" +
                    getType(text.charAt(i)));
        }
    }
}
