package CoreProgramming.LinkedList;

import java.util.Scanner;

class TaskNode {
    int id, priority;
    String name, dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskCircularList {
    private TaskNode head = null, current = null;

    void addTask(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " | " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    void nextTask() {
        if (current != null) {
            current = current.next;
            System.out.println("Current Task: " + current.name);
        }
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskCircularList list = new TaskCircularList();

        while (true) {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Next Task");
            System.out.println("4. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.addTask(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    list.displayTasks();
                    break;
                case 3:
                    list.nextTask();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
