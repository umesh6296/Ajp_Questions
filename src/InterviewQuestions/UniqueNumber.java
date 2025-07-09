package InterviewQuestions;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 5, 3, 4 , 2};
        System.out.println("Unique number is: " + findUnique(arr));
    }
    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR each number
        }
        return result;
    }
}
