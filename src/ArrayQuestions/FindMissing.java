package ArrayQuestions;

import java.util.Scanner;
//Find the missing number in an array.
public class FindMissing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // First we sort the array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
// Then we find missing number
        System.out.print("Missing number in this array is:");
        for(int i=0;i<arr.length;i++){
            if(i<=arr.length-2) {
                for (int j = arr[i]; j < arr[i + 1]; j++) {
                    if (arr[i] != j) {
                        System.out.print(j+" ");
                    }
                }
            }
        }
    }
}
