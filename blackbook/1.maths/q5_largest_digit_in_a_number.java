import java.util.Scanner;
public class q5_largest_digit_in_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = largestDigit(n);
        System.out.println("Largest digit:"+result);
        sc.close();
    }
    public static int largestDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n = n / 10;
        }
        return maxDigit;
    }
}
