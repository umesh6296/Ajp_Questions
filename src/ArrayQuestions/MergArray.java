package ArrayQuestions;

import java.util.Scanner;

//Merge two sorted arrays.
public class MergArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Now enter the "+size+" element in first array");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Now enter the "+size2+" element in first array");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        MergArray mergArray=new MergArray();

        int []newMerge=mergArray.sortArray( mergArray.mergeSortedArray(arr1,arr2));
        System.out.println("Merge Two sorted array:");
        for(int i=0;i<newMerge.length;i++){
            System.out.println(newMerge[i]+" ");
        }
    }
    public int[] mergeSortedArray(int arr1[],int arr2[]){
        int size1=arr1.length;
        int size2=arr2.length;

        int afterMerg[]=new int[size1+size2];

        for(int i=0;i<afterMerg.length-(size2);i++){
            afterMerg[i]=arr1[i];
        }
        int j=0;
        for(int i=size1;i<afterMerg.length;i++){
            afterMerg[i]=arr2[j];
            j++;
        }
       return afterMerg;
    }

    public int[] sortArray(int[] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
