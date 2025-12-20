package CoreProgramming.ProgrammingElements.level2;

import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int eachGets = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " +
                eachGets + " and the number of remaining chocolates are " + remaining);

        sc.close();
    }
}