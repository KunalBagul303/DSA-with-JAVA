import java.util.ArrayList;

class StackUsingArrayList {

    private ArrayList<Integer> stack;

    // Constructor
    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    // Push operation
    public void push(int data) {
        stack.add(data);
        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int topElement = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return topElement;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    // isEmpty operation
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    // Size operation
    public int size() {
        return stack.size();
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements (Top to Bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}

public class Arrraylist {
    public static void main(String[] args) {

        StackUsingArrayList stack = new StackUsingArrayList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        stack.display();

        System.out.println("Stack size: " + stack.size());
    }
}