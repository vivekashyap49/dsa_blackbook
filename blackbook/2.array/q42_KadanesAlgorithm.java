public class q42_KadanesAlgorithm {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(nums1)); // 15

        int[] nums2 = {-2, -3, -7, -2, -10, -4};
        System.out.println(maxSubArray(nums2)); // -2
    }

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
