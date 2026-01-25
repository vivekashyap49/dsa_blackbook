public class q22_CircularSeatingArrangement {

    public static void main(String[] args) {

        int N = 4;
        System.out.println(countWays(N)); // 12

        N = 10;
        System.out.println(countWays(N)); // 725760
    }

    public static long countWays(int N) {

        if (N < 2) {
            return 0;
        }

        long fact = 1;

        for (int i = 1; i <= N - 1; i++) {
            fact *= i;
        }

        return 2 * fact;
    }
}
