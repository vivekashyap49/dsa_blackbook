public class q47_MaximumProductSubarray {

    public static void main(String[] args) {

        int[] nums1 = {4, 5, 3, 7, 1, 2};
        System.out.println(maxProduct(nums1)); // 840

        int[] nums2 = {-5, 0, -2};
        System.out.println(maxProduct(nums2)); // 0
    }

    public static int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If current number is negative, swap
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            result = Math.max(result, maxProd);
        }

        return result;
    }
}
