import java.util.*;
public class SplitArrayLargestSum {
    public static void main(String[] args)
    {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        int answer = splitArray(nums, m);

        System.out.println(answer);
    }

    static int splitArray(int[] nums, int m)
    {
        // Define search space
        int left = 0;   // minimum possible answer
        int right = 0;  // maximum possible answer

        for (int num : nums) {
            left = Math.max(left, num); // max element
            right += num;               // sum of all elements
        }

        // Binary search on answer
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, m, mid)) {
                // mid is possible, try smaller answer
                right = mid - 1;
            } else {
                // mid is not possible, need bigger answer
                left = mid + 1;
            }
        }

            return left;
    }

    // Greedy feasibility check
    static boolean canSplit(int[] nums, int m, int maxAllowedSum) {

        int subarrayCount = 1; // at least one subarray
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                // start new subarray
                subarrayCount++;
                currentSum = num;

                if (subarrayCount > m) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }

            return true;
    }
}


