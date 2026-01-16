package Data_Structure.Stack_Queue_HashMap_and_Hashing_Function.Hash_Maps_and_Hash_Functions;

public class CustomHashMap {

    static class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 1000;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        Node head = table[idx];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node node = new Node(key, value);
        node.next = table[idx];
        table[idx] = node;
    }

    public int get(int key) {
        int idx = hash(key);
        Node head = table[idx];

        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 10);
        map.put(2, 20);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}
