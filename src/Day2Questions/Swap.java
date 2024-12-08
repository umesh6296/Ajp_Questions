package Day2Questions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Before swap a="+a);
        System.out.println("Before swap b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a="+a);
        System.out.println("After swap b="+b);
    }


}
