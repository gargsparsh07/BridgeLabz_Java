package Object_oriented_programming.JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy constructor
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println("\n--- Booking Details ---");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        b1.display();

        HotelBooking b2 = new HotelBooking("Amit", "Deluxe", 3);
        b2.display();

        HotelBooking b3 = new HotelBooking(b2);
        b3.display();
    }
}
