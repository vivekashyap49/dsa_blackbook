import java.util.Scanner;

public class q28_BinaryToOctal {

    public static String binaryToOctal(String binary) {

        // Pad leading zeros if length not multiple of 3
        int len = binary.length();
        int padding = (3 - len % 3) % 3;

        for (int i = 0; i < padding; i++) {
            binary = "0" + binary;
        }

        StringBuilder octal = new StringBuilder();

        // Convert each group of 3 bits
        for (int i = 0; i < binary.length(); i += 3) {
            String group = binary.substring(i, i + 3);
            int decimal = Integer.parseInt(group, 2);
            octal.append(decimal);
        }

        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();
        System.out.println(binaryToOctal(binary));

        sc.close();
    }
}
