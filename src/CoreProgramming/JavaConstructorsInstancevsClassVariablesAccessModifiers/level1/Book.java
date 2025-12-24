package CoreProgramming.JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {
        System.out.println("Using Default Constructor");
        Book b1 = new Book();
        b1.display();

        System.out.println("\nUsing Parameterized Constructor");
        Book b2 = new Book("Java Basics", "James Gosling", 499);
        b2.display();
    }
}
