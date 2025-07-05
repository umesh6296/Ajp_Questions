package InterviewQuestions;

import java.util.Stack;

public class MakeParenthesisValid {
    public static void main(String[] args) {
        String s="()())((";
        int re=numberForValidPar(s);
        if(re>0) {
            System.out.println("Make Valid parentheses  we need " + re + " more brackets");
        }else {
            System.out.println("Parentheses are already valid!");
        }
    }
    public static int numberForValidPar(String s) {
        int open = 0, close = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++; // count of unmatched opening brackets
            } else if (ch == ')') {
                if (open > 0) {
                    open--; // match with an open
                } else {
                    close++; // unmatched closing bracket
                }
            }
        }
        return open + close; // total brackets needed to make it valid
    }
}
