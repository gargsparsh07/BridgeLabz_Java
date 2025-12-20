package CoreProgramming.JavaMethods.level3;

public class MatrixOperations {

    public static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static void display(int[][] m) {
        for (int[] row : m) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = createMatrix(2, 2);
        int[][] b = createMatrix(2, 2);

        System.out.println("Matrix A:");
        display(a);

        System.out.println("Matrix B:");
        display(b);

        System.out.println("Addition:");
        display(add(a, b));

        System.out.println("Subtraction:");
        display(subtract(a, b));

        System.out.println("Transpose of A:");
        display(transpose(a));

        System.out.println("Determinant of A: " + determinant2x2(a));
    }
}
