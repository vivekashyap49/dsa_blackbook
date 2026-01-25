public class q2_MinimizeTotalCostWithGCDDiscount {

    public static void main(String[] args) {

        int[] prices = {50, 100, 150};

        int index = getBestItemIndex(prices);
        System.out.println(index); // Output: 2 (0-based index)
    }

    public static int getBestItemIndex(int[] prices) {

        int gcd = prices[0];
        int maxPrice = prices[0];
        int maxIndex = 0;

        for (int i = 1; i < prices.length; i++) {
            gcd = findGCD(gcd, prices[i]);

            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxIndex = i;
            }
        }

        // Discount should be applied on max price item
        return maxIndex;
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
