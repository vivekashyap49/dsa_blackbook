import java.util.HashMap;
import java.util.Map;

public class q51_CountSubarraysWithSumK {

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(countSubarrays(nums1, k1)); // 2

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(countSubarrays(nums2, k2)); // 2
    }

    public static int countSubarrays(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
