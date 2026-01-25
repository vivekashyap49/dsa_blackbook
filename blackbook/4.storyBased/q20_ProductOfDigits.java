public class q20_ProductOfDigits {

    public static void main(String[] args) {

        int N = 5244;
        System.out.println(calculatePrice(N)); // 160
    }

    public static int calculatePrice(int N) {

        int product = 1;

        while (N > 0) {
            int digit = N % 10;
            product *= digit;
            N = N / 10;
        }

        return product;
    }
}
