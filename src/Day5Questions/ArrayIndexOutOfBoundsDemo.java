package Day5Questions;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Loop through the array, intentionally going beyond its bounds
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Accessing index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and display a message
            System.err.println("Exception caught: Attempted to access an index outside the array bounds.");
            System.err.println("Error details: " + e.getMessage());
        }
    }
}

