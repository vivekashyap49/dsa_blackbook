public class q37_pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(pascalValue(4, 2)); // 3
        System.out.println(pascalValue(5, 3)); // 6
    }
    public static int pascalValue(int r, int c) {

        // invalid case
        if (c > r) {
            return 0;
        }

        int n = r - 1;
        int k = c - 1;

        int result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

}
