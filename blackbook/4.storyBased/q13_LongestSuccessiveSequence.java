import java.util.HashSet;

public class q13_LongestSuccessiveSequence {

    public static void main(String[] args) {

        int[] A = {5, 8, 3, 2, 1, 4};
        int N = A.length;

        System.out.println(longestSuccessiveSequence(A, N)); // 5
    }

    public static int longestSuccessiveSequence(int[] A, int N) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : A) {
            set.add(num);
        }

        int longest = 0;

        for (int num : A) {

            // Start only if previous number doesn't exist
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
