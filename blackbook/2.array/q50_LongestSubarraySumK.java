import java.util.HashMap;
import java.util.Map;

public class q50_LongestSubarraySumK {

    public static void main(String[] args) {

        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println(longestSubarray(nums1, k1)); // 4

        int[] nums2 = {-3, 2, 1};
        int k2 = 6;
        System.out.println(longestSubarray(nums2, k2)); // 0
    }

    public static int longestSubarray(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            // Case 1: subarray from 0 to i
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray in between
            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            // store prefixSum only if not already present
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}
