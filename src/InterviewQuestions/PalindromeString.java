package InterviewQuestions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write a String");
        String s=sc.next();
        boolean isPal=isPalindrome(s);
        System.out.println("Is Given String Palindrome: "+isPal);
    }
    public static boolean isPalindrome(String s){
        String re="";
        for (int i = s.length() - 1; i >= 0; i--) {
            re += s.charAt(i); // reverse the string
        }
        return s.equals(re); // compare actual content, not reference
    }
}
