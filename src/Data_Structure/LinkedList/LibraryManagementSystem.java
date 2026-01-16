package Data_Structure.LinkedList;

import java.util.Scanner;

class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String title, String author, String genre, boolean available) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

class LibraryList {
    private BookNode head, tail;

    void addBook(int id, String t, String a, String g, boolean avail) {
        BookNode node = new BookNode(id, t, a, g, avail);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Book removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println(temp.title + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Status updated.");
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.available);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryList list = new LibraryList();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Update Availability");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Reverse");
            System.out.println("7. Count Books");
            System.out.println("8. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.addBook(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextBoolean());
                    break;
                case 2:
                    list.removeBook(sc.nextInt());
                    break;
                case 3:
                    list.searchByTitle(sc.next());
                    break;
                case 4:
                    list.updateAvailability(sc.nextInt(), sc.nextBoolean());
                    break;
                case 5:
                    list.displayForward();
                    break;
                case 6:
                    list.displayReverse();
                    break;
                case 7:
                    System.out.println("Total Books: " + list.countBooks());
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
