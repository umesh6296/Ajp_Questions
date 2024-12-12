package ArrayQuestions;

import java.util.Scanner;

public class ReverseArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the array in reverse order
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

