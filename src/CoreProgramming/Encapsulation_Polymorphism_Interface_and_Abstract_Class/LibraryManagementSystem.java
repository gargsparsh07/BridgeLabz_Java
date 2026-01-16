package CoreProgramming.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item: " + title);
    }
}

class Book extends LibraryItem {
    public Book(String t) { super(t); }
    public int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem {
    public Magazine(String t) { super(t); }
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String t) { super(t); }
    public int getLoanDuration() { return 3; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item = new Book("Java Basics");
        item.getItemDetails();
        System.out.println("Loan Days: " + item.getLoanDuration());
    }
}
