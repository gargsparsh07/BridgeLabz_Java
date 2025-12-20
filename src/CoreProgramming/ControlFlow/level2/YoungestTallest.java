package CoreProgramming.ControlFlow.level2;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar age and height: ");
        int aAge = sc.nextInt();
        int aHeight = sc.nextInt();

        System.out.print("Enter Akbar age and height: ");
        int bAge = sc.nextInt();
        int bHeight = sc.nextInt();

        System.out.print("Enter Anthony age and height: ");
        int cAge = sc.nextInt();
        int cHeight = sc.nextInt();

        int youngest = Math.min(aAge, Math.min(bAge, cAge));
        int tallest = Math.max(aHeight, Math.max(bHeight, cHeight));

        System.out.println("Youngest age is: " + youngest);
        System.out.println("Tallest height is: " + tallest);
    }
}
