package Day3Question;

import java.util.Scanner;

public class StrongNumber {
    // Method to calculate factorial of a digit
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String orignalNumber=sc.next();

        int sumOfnumber=0;
        for(int i=0;i<orignalNumber.length();i++){
            int fact=1;
            int n=Integer.parseInt(String.valueOf(orignalNumber.charAt(i)));
            for(int j=1;j<=n;j++){
                fact*=j;
            }
            sumOfnumber+=fact;
        }
        int orNumberInt=Integer.parseInt(orignalNumber);
        if(orNumberInt==sumOfnumber){
            System.out.println(orNumberInt+" is a strong number");
        }
        else{
            System.out.println(orNumberInt+" is not strong number");
        }

    }
}
