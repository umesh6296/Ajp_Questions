package ArrayQuestions;

import java.util.Scanner;
//Sort an array in ascending order.
public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[i]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        System.out.println("After sorting array in ascending Order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
