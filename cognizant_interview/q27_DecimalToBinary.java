import java.util.Scanner;

public class q27_DecimalToBinary {

    public static String decimalToBinary(int n) {

        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }

        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(decimalToBinary(n));

        sc.close();
    }
}
