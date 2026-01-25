public class q3_PerfectSquareDigitSumNumber {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(generateNumber(n));
    }

    public static String generateNumber(int n) {

        if (n == 1) {
            return "1"; // 1² = 1 (perfect square)
        }

        StringBuilder sb = new StringBuilder();

        // Start with 122 → sum of squares = 9
        sb.append("122");

        // Fill remaining digits with '1'
        for (int i = 3; i < n; i++) {
            sb.append("1");
        }

        return sb.toString();
    }
}
