package CoreProgramming.JavaString.level2;

class StudentGrade {

    // Method to generate random PCM marks
    static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 101); // 0–100
            }
        }
        return marks;
    }

    // Method to calculate total, average & percentage
    static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][4];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate grade
    static String[] calculateGrade(double[][] results) {

        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {

            double percent = results[i][2];

            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard
    static void displayScorecard(int[][] marks, double[][] results, String[] grades) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int)results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {

        int students = 5; // change if needed

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrade(results);

        displayScorecard(marks, results, grades);
    }
}
