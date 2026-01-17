package Object_oriented_programming.JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    void display() {
        System.out.println("\n--- Library Book Details ---");
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
        System.out.println("Available : " + available);
    }

    public static void main(String[] args) {
        System.out.println("Library Book System");

        LibraryBook book = new LibraryBook(
                "OOP in Java",
                "Balagurusamy",
                599
        );

        book.display();

        System.out.println("\nBorrowing the book...");
        book.borrowBook();

        book.display();
    }
}
