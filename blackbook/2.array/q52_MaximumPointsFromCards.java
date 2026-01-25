public class q52_MaximumPointsFromCards {

    public static void main(String[] args) {

        int[] cards1 = {1, 2, 3, 4, 5, 6};
        int k1 = 3;
        System.out.println(maxScore(cards1, k1)); // 15

        int[] cards2 = {5, 4, 1, 8, 7, 1, 3};
        int k2 = 3;
        System.out.println(maxScore(cards2, k2)); // 12
    }

    public static int maxScore(int[] cardScore, int k) {

        int n = cardScore.length;

        // edge case: take all cards
        if (k == n) {
            int sum = 0;
            for (int num : cardScore) sum += num;
            return sum;
        }

        int totalSum = 0;
        for (int num : cardScore) {
            totalSum += num;
        }

        int windowSize = n - k;
        int windowSum = 0;

        // initial window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardScore[i];
        }

        int minWindowSum = windowSum;

        // sliding window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardScore[i];
            windowSum -= cardScore[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}
