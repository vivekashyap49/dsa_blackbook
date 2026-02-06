import java.util.Scanner;

public class q21_PrimeFactorsOfNumber {

    public static void printPrimeFactors(int n) {

        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // n must be odd at this point
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPrimeFactors(n);

        sc.close();
    }
}
