package InterviewQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for Factorial: ");
        int num=sc.nextInt();
        int result=factIt(num);
        System.out.println("Factorial using iteration: "+result);
        result=factRec(num);
        System.out.println("Factorial using recursion: "+result);
    }
    public static int factIt(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static int factRec(int num){
        if (num == 0 || num == 1)return 1;
        return num*factRec(num-1);
    }
}
