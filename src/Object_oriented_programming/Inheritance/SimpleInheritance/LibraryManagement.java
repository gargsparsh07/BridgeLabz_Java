package Object_oriented_programming.Inheritance.SimpleInheritance;

// Superclass
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author details
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author(
                "Java Programming",
                2023,
                "James Gosling",
                "Creator of Java programming language"
        );

        author.displayInfo();
    }
}
