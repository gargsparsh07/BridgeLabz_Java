package CoreProgramming.JavaString.level2;

class VotingCheck {

static int[] generateAges(int n) {
    int[] ages = new int[n];
    for (int i = 0; i < n; i++)
        ages[i] = (int)(Math.random() * 80);
    return ages;
}

static String[][] checkVoting(int[] ages) {

    String[][] result = new String[ages.length][2];

    for (int i = 0; i < ages.length; i++) {
        result[i][0] = String.valueOf(ages[i]);
        result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
    }
    return result;
}

public static void main(String[] args) {

    int[] ages = generateAges(10);
    String[][] result = checkVoting(ages);

    System.out.println("Age\tStatus");
    for (String[] row : result) {
        System.out.println(row[0] + "\t" + row[1]);
    }
}
}

