package ArrayQuestions;

import java.util.Scanner;
//Reverse an array.
public class ReverseArra {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After reversing array:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
