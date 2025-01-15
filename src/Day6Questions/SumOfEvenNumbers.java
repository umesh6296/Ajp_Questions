package Day6Questions;

import java.util.ArrayList;

//3.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);

        // Calculate the sum of all even numbers
        int sum = 0;
        for (int num : numberList) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        // Display the sum of even numbers
        System.out.println("Sum of Even Numbers: " + sum);
    }
}

