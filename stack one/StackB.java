import java.util.Stack;

public class StackB {

    // Function to push element at bottom of stack
    public static void pushAtBottom(Stack<Integer> s, int data) {

        // Base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Remove top element
        int top = s.pop();

        // Recursive call
        pushAtBottom(s, data);

        // Push removed element back
        s.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack: " + s);

        pushAtBottom(s, 4);

        System.out.println("After pushing 4 at bottom: " + s);
    }
}