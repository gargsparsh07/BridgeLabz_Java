package Object_oriented_programming.this_static_final_key_words_and_instance_of_operator;

class Book {
    static String libraryName = "Central Library";
    String title, author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        System.out.println(title + " by " + author + " | ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James", "ISBN123");

        if (b instanceof Book) {
            b.display();
        }

        Book.displayLibraryName();
    }
}
