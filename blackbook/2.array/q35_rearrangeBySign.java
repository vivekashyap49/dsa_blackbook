import java.util.*;
public class q35_rearrangeBySign {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 5, -1, -3, -4};
        int[] result1 = rearrangeArray(nums1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {1, -1, -3, -4, 2, 3};
        int[] result2 = rearrangeArray(nums2);
        System.out.println(Arrays.toString(result2));
    }
    public static int[] rearrangeArray(int[] nums) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int[] result = new int[nums.length];
        int i = 0, p = 0, n = 0;

        // Fill alternately: positive, negative
        while (p < pos.size() && n < neg.size()) {
            result[i++] = pos.get(p++);
            result[i++] = neg.get(n++);
        }

        return result;
    }
}
