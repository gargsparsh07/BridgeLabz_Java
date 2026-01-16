package Data_Structure.Stack_Queue_HashMap_and_Hashing_Function.Stack_and_Queue;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    public void enqueue(int x) {
        pushStack.push(x);
    }

    public int dequeue() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        if (popStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return popStack.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}

