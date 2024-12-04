package Day3Question;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers separated by spaces:");
        int[] arr=new int[10];

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int[] subArray = Arrays.copyOfRange(arr, 2, 6 );
        System.out.println("Sub array is:-");
        for(int i=0;i<subArray.length;i++){
            System.out.println(subArray[i]);
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num : subArray) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        System.out.println("Second highest number in sub array is:"+secondHighest);

    }


}

