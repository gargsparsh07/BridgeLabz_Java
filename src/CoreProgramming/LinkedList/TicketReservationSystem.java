package CoreProgramming.LinkedList;

import java.util.Scanner;

class TicketNode {
    int ticketId;
    String customer, movie;
    TicketNode next;

    TicketNode(int id, String customer, String movie) {
        this.ticketId = id;
        this.customer = customer;
        this.movie = movie;
    }
}

class TicketCircularList {
    private TicketNode head = null;

    void bookTicket(int id, String cust, String movie) {
        TicketNode node = new TicketNode(id, cust, movie);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void cancelTicket(int id) {
        if (head == null) return;

        TicketNode temp = head, prev = null;
        do {
            if (temp.ticketId == id) {
                if (prev != null)
                    prev.next = temp.next;
                else {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketCircularList list = new TicketCircularList();

        list.bookTicket(1, "Ram", "Avatar");
        list.bookTicket(2, "Shyam", "Dune");

        list.displayTickets();
        list.cancelTicket(1);
        list.displayTickets();
    }
}
