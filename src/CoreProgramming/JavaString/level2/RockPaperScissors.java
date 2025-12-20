package CoreProgramming.JavaString.level2;

import java.util.Scanner;

class RockPaperScissors {

    // Method to get computer choice
    static String getComputerChoice() {
        int r = (int) (Math.random() * 3);
        if (r == 0) return "Rock";
        else if (r == 1) return "Paper";
        else return "Scissors";
    }

    // Method to find winner
    static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if (user.equalsIgnoreCase("Rock") && computer.equals("Scissors") ||
                user.equalsIgnoreCase("Paper") && computer.equals("Rock") ||
                user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
            return "User";

        return "Computer";
    }

    // Method to calculate statistics
    static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        userPercent = Math.round(userPercent * 100.0) / 100.0;
        compPercent = Math.round(compPercent * 100.0) / 100.0;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(compPercent);

        return stats;
    }

    // Method to display stats
    static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tWin Percentage");
        for (String[] row : stats) {
            System.out.println(
                    row[0] + "\t" +
                            row[1] + "\t" +
                            row[2] + "%"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("\nGame " + i + " - Enter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();

            System.out.println("Computer chose: " + computerChoice);

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
                userWins++;
                System.out.println("Winner: User");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Winner: Computer");
            } else {
                System.out.println("Result: Draw");
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayStats(stats);
    }
}
