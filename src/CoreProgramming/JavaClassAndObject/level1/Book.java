package CoreProgramming.JavaClassAndObject.level1;

import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Details");
        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Book b = new Book();
        b.title = title;
        b.author = author;
        b.price = price;

        b.displayBook();
    }
}
