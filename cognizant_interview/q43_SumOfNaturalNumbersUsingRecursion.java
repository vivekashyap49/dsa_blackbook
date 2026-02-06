import java.util.Scanner;

public class q43_SumOfNaturalNumbersUsingRecursion {

    public static int sumOfNaturalNumbers(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sumOfNaturalNumbers(n));

        sc.close();
    }
}
