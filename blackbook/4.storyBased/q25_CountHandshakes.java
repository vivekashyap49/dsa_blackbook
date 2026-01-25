public class q25_CountHandshakes {

    public static void main(String[] args) {

        int T = 2;
        int[] people = {1, 2};

        for (int i = 0; i < T; i++) {
            System.out.println(countHandshakes(people[i]));
        }
    }

    public static long countHandshakes(long N) {

        if (N <= 1) {
            return 0;
        }

        return (N * (N - 1)) / 2;
    }
}
