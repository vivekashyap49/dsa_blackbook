import java.util.*;

public class q39_TwoSum {

    public static void main(String[] args) {

        int[] nums1 = {1, 6, 2, 10, 3};
        int target1 = 7;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {1, 3, 5, -7, 6, -3};
        int target2 = 0;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int idx1 = map.get(complement);
                int idx2 = i;

                // return indices in non-decreasing order
                return new int[]{Math.min(idx1, idx2), Math.max(idx1, idx2)};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // never reached as per problem
    }
}
