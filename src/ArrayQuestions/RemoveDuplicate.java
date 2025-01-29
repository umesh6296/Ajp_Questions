package ArrayQuestions;

import java.util.HashSet;
import java.util.Scanner;
//Remove duplicates from an array.
public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate ob=new RemoveDuplicate();
      //  ob.sortedAndUnsorted();
        //ob.onlySorted();
        //ob.withoutTemp();
        ob.removeBoth();
    }
    public int[] forTakeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Now enter the "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    //===============First Way to remove duplicate value in unsorted/sorted=============
    public void sortedAndUnsorted(){
        int []arr=forTakeInput();
        HashSet obj=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            obj.add(arr[i]);
        }
        System.out.println("After removing duplicate value: "+obj);
    }
    //=============Second way to remove duplicate value in sorted array=========
    public void onlySorted(){
        int []arr=forTakeInput();
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        System.out.println("After remove duplicate value: ");
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
            System.out.print(temp[i]+" ");
            }
        }
    }
    //==========Third way to remove duplicate value in sorted array without sorting========
    public void withoutTemp(){
        int []arr=forTakeInput();
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        System.out.println("After remove duplicate value: ");
        for(int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //==========Fourth way to remove duplicate value in sorted and unsorted array ========
    public void removeBoth(){
        int []arr=forTakeInput();
        //First we sort array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //Then we remove duplicaate value
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        System.out.println("After remove duplicate value: ");
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                System.out.print(temp[i]+" ");
            }
        }

    }
}
