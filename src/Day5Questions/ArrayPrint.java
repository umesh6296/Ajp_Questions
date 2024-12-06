package Day5Questions;

public class ArrayPrint {
    public static void main(String[] args) {
        // Initialize an array of size 100
        int[] numbers = new int[100];

        // Fill the array with values from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Print the array elements
        System.out.println("Array elements from 1 to 100:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

