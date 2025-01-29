package ArrayQuestions;

import java.util.Scanner;
//Search for an element in an array.
public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number those you want to search");
        int num=sc.nextInt();
        boolean isFound=false;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==num){
                System.out.println("The "+num+" is found at index: "+i);
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("The "+num+" is not found");
        }
    }
}
