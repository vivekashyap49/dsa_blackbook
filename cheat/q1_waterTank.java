public class q1_waterTank{

    public static String findBalanceIndex(String[] arr) {

        int n = arr.length;
        int[] values = new int[n];

        // Convert "0.6" → 6
        for (int i = 0; i < n; i++) {
            values[i] = arr[i].charAt(2) - '0';
        }

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += values[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - values[i];

            // ✅ CORRECT CONDITION
            if (leftSum == rightSum) {
                return String.valueOf(i);
            }

            leftSum += values[i];
        }

        return "-1";
    }

    public static void main(String[] args) {
        String[] arr = {"0.6", "0.7", "0.3", "0.8", "0.5"};
        System.out.println(findBalanceIndex(arr)); // ✅ 2
    }
}
