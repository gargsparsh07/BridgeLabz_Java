package Data_Structure.LinkedList;

import java.util.Scanner;

class TextNode {
    String content;
    TextNode prev, next;

    TextNode(String content) {
        this.content = content;
    }
}

class TextEditor {
    private TextNode current;

    void type(String text) {
        TextNode node = new TextNode(text);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
    }
}

public class UndoRedoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.display();
        editor.undo();
        editor.display();
        editor.redo();
        editor.display();
    }
}
