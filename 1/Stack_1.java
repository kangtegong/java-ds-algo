import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // push() method is used to add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // pop() method is used to remove elements from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        // peek() method is used to return the top element of the stack without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // empty() method is used to check if the stack is empty
        boolean isStackEmpty = stack.empty();
        System.out.println("Is stack empty? " + isStackEmpty);

        // search() method is used to search for an element in the stack
        int position = stack.search(2);
        System.out.println("Position of 2: " + position);
    }
}
