package CoreProgramming.LinkedList;

import java.util.Scanner;

class ItemNode {
    int itemId, quantity;
    String name;
    double price;
    ItemNode next;

    ItemNode(int itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {
    private ItemNode head;

    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println(temp.itemId + " " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    double totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(
                    temp.itemId + " | " + temp.name + " | " +
                            temp.quantity + " | " + temp.price
            );
            temp = temp.next;
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryList list = new InventoryList();

        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. Display Items");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    list.removeById(sc.nextInt());
                    break;
                case 3:
                    list.updateQuantity(sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    list.searchById(sc.nextInt());
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Total Value: " + list.totalValue());
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
