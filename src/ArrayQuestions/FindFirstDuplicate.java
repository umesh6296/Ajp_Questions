package ArrayQuestions;

import java.util.Scanner;

//Find the first duplicate in an array.
public class FindFirstDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean isDup=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The First Duplicate number is: "+arr[i]);
                    isDup=true;
                }
            }
            if(isDup){
                break;
            }
        }
    }
}
