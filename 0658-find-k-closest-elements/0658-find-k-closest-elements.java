import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Two-pointer approach
        int left = 0;
        int right = arr.length - 1;

        // Shrink the window size to exactly k elements
        while (right - left >= k) {
            // Compare the distance from 'x' for both ends of the window
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        // Create the result list with the k closest elements
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
