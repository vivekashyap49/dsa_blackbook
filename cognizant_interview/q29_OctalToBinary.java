import java.util.Scanner;

public class q29_OctalToBinary {

    public static String octalToBinary(String octal) {

        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < octal.length(); i++) {
            char digit = octal.charAt(i);

            switch (digit) {
                case '0': binary.append("000"); break;
                case '1': binary.append("001"); break;
                case '2': binary.append("010"); break;
                case '3': binary.append("011"); break;
                case '4': binary.append("100"); break;
                case '5': binary.append("101"); break;
                case '6': binary.append("110"); break;
                case '7': binary.append("111"); break;
            }
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();
        System.out.println(octalToBinary(octal));

        sc.close();
    }
}
