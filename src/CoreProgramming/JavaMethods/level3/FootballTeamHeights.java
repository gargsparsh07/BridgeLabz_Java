package CoreProgramming.JavaMethods.level3;

public class FootballTeamHeights {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) min = Math.min(min, x);
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) max = Math.max(max, x);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Mean Height: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}
