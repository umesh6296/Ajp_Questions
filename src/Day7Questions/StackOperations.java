package Day7Questions;

import java.util.Stack;
//2.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from stack and display it.
public class StackOperations {
    public static void main(String[] args) {
        // Declare a Stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println("Original Stack: " + stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        System.out.println("Stack after removing 4 elements: " + stack);
    }
}

