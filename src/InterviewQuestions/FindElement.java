package InterviewQuestions;

import java.util.Collections;
import java.util.PriorityQueue;
public class FindElement {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 11, 45, 32};
        int k = 3;

        int result = findKthSmallest(arr, k);
        System.out.println(k + "rd smallest element is: " + result);
    }

    public static int findKthSmallest(int[] arr, int k) {
        // Max-Heap to keep smallest k elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove largest among the k+1 elements
            }
        }

        return maxHeap.peek(); // Top of maxHeap is the kth smallest
    }
}
