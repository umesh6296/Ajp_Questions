package AdvanceLevelQuestions;

import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] args) {
        String s = "){}[(]";
        boolean isBal = isBalanced(s);
        if (isBal) {
            System.out.println("Given String is Balanced");
        } else {
            System.out.println("Given String is not Balanced");
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; // No match
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        return stack.isEmpty(); // Stack should be empty if all brackets matched
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
