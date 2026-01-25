public class q23_SpecialArray {

    public static void main(String[] args) {

        int[] nums1 = {1};
        int[] nums2 = {2, 1, 4};
        int[] nums3 = {4, 3, 1, 6};

        System.out.println(isSpecial(nums1)); // true
        System.out.println(isSpecial(nums2)); // true
        System.out.println(isSpecial(nums3)); // false
    }

    public static boolean isSpecial(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            // Same parity check
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }

        return true;
    }
}
