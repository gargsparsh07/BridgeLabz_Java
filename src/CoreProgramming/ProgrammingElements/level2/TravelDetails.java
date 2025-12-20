package CoreProgramming.ProgrammingElements.level2;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from FromCity to ViaCity (miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from ViaCity to ToCity (miles): ");
        double viaToFinal = sc.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double time = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinal;
        double speed = totalDistance / time;

        System.out.println("Name: " + name +
                "\nFrom: " + fromCity +
                "\nVia: " + viaCity +
                "\nTo: " + toCity +
                "\nTotal Distance: " + totalDistance +
                "\nSpeed: " + speed + " miles/hour");

        sc.close();
    }
}