package Object_oriented_programming.ObjectOrientedDesignPrinciples.AssistedProblems;

import java.util.*;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book b) {
        books.add(b);
    }

    void displayBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");

        Library lib1 = new Library("Central");
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib1.displayBooks();
    }
}
