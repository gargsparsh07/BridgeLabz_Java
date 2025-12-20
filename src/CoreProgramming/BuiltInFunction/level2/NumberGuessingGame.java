package CoreProgramming.BuiltInFunction.level2;

import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        int low = 1, high = 100;
        boolean guessed = false;

        while (!guessed) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high / low / correct)");
            String feedback = getFeedback();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it right 🎉");
                guessed = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    static String getFeedback() {
        return sc.nextLine();
    }
}
