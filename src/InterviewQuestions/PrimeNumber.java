package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give a number: ");
        int num=sc.nextInt();
        boolean isPr=isPrime(num);
        System.out.println("Given number is prime? :- "+isPr);
    }
    public static boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }

}
