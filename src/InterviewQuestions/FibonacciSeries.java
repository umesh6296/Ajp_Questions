package InterviewQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length to print fibonacci series: ");
        int num=sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
