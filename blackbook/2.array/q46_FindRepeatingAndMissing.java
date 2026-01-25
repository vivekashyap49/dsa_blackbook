public class q46_FindRepeatingAndMissing {

    public static void main(String[] args) {

        int[] nums1 = {3, 5, 4, 1, 1};
        printResult(findNumbers(nums1));

        int[] nums2 = {1, 2, 3, 6, 7, 5, 7};
        printResult(findNumbers(nums2));
    }

    public static int[] findNumbers(int[] nums) {

        int n = nums.length;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int num : nums) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2L * n + 1) / 6;

        long diff = actualSum - expectedSum;            // A - B
        long sqDiff = actualSqSum - expectedSqSum;      // A^2 - B^2

        long sum = sqDiff / diff;                        // A + B

        int repeating = (int) ((diff + sum) / 2);
        int missing = (int) (sum - repeating);

        return new int[]{repeating, missing};
    }

    private static void printResult(int[] result) {
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
