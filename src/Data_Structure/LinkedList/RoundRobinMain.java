package Data_Structure.LinkedList;

import java.util.Scanner;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

class RoundRobinScheduler {
    private ProcessNode head = null;

    void addProcess(int pid, int burst) {
        ProcessNode node = new ProcessNode(pid, burst);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    void execute(int quantum) {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            if (temp.remainingTime > 0) {
                int exec = Math.min(quantum, temp.remainingTime);
                temp.remainingTime -= exec;
                System.out.println("Process " + temp.pid + " executed for " + exec);
            }
            temp = temp.next;
        } while (temp != head);
    }

    void display() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.pid + " Remaining: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler rr = new RoundRobinScheduler();

        while (true) {
            System.out.println("\n--- Round Robin Menu ---");
            System.out.println("1. Add Process");
            System.out.println("2. Execute Round");
            System.out.println("3. Display Processes");
            System.out.println("4. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    rr.addProcess(sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    rr.execute(sc.nextInt());
                    break;
                case 3:
                    rr.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
