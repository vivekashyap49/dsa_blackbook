import java.util.Scanner;

public class q26_BinaryToDecimal {

    public static int binaryToDecimal(int binary) {

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        System.out.println(binaryToDecimal(binary));

        sc.close();
    }
}
