import java.util.Arrays;

public class q43_NextPermutation {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // [1, 3, 2]
    }

    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Step 1: find breakpoint
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: find just larger element and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
