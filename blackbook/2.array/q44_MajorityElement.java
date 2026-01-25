public class q44_MajorityElement {

    public static void main(String[] args) {

        int[] nums1 = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(nums1)); // 7

        int[] nums2 = {1, 1, 1, 2, 1, 2};
        System.out.println(majorityElement(nums2)); // 1
    }

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
