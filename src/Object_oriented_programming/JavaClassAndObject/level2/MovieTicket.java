package Object_oriented_programming.JavaClassAndObject.level2;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

    void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat No    : " + seatNumber);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket t = new MovieTicket();

        System.out.println("Enter Movie Name");
        t.movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        t.bookTicket(seat, price);
        t.displayTicket();
    }
}
