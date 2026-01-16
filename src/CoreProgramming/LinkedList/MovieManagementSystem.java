package CoreProgramming.LinkedList;

import java.util.Scanner;

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = this.next = null;
    }
}

class MovieDoublyList {
    private MovieNode head, tail;

    void addAtEnd(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void deleteByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Movie deleted.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieDoublyList list = new MovieDoublyList();

        while (true) {
            System.out.println("\n--- Movie Menu ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Delete Movie");
            System.out.println("3. Update Rating");
            System.out.println("4. Display Forward");
            System.out.println("5. Display Reverse");
            System.out.println("6. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    list.deleteByTitle(sc.next());
                    break;
                case 3:
                    list.updateRating(sc.next(), sc.nextDouble());
                    break;
                case 4:
                    list.displayForward();
                    break;
                case 5:
                    list.displayReverse();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
