package InterviewQuestions;
import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 4},
                {6, 9},
                {8, 10}
        };

        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            int currentStart = current[0];
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                // Overlap → merge
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap → move to next
                current = interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
