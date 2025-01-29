package ArrayQuestions;

import java.util.Scanner;
// Rotate an array by a given number of positions.
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate:");
        int pos=sc.nextInt();
        System.out.println("After rotate: ");
        for(int i=arr.length-pos;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length-pos;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
