import java.util.*;

public class q49_LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums1)); // 4

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums2)); // 9
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // start of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
