package ArrayQuestions;

import java.util.Scanner;

//Find the pair of elements that add up to a given sum.
public class FindUpToSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        findSum(arr);

    }
    public static void findSum(int []arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sum that i find a pair of elements that add up:");
        int sum=sc.nextInt();
        int co=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("The "+co+" pair of up to sum "+sum+" is: "+arr[i]+" , "+arr[j]);
                    co++;
                }
            }
        }
    }
}
