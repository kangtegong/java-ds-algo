import java.util.Stack;

public class Stack_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // adding elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        // simply print stack variable
        System.out.println(stack);

        // using for-each loop
        System.out.println("Printing elements using for-each loop:");
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();

        // using for loop
        System.out.println("Printing elements using for loop:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();

        // using iterator
        System.out.println("Printing elements using iterator:");
        java.util.Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // using while loop
        System.out.println("Printing elements using while loop:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
