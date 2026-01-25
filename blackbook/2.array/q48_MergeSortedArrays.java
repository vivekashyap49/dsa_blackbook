import java.util.Arrays;

public class q48_MergeSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int[] nums2 = {-3, 1, 8};

        merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {0, 2, 7, 8, 0, 0, 0};
        int[] nums4 = {-7, -3, -1};

        merge(nums3, 4, nums4, 3);
        System.out.println(Arrays.toString(nums3));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge from end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining nums2 elements (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
