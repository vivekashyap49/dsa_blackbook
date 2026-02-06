import java.util.Scanner;

public class q30_NumberToWords {

    public static void printNumberInWords(int n) {

        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        if (n == 0) {
            System.out.println("Zero");
            return;
        }

        StringBuilder digits = new StringBuilder();

        // Extract digits
        while (n > 0) {
            int digit = n % 10;
            digits.append(digit);
            n /= 10;
        }

        // Print words in correct order
        for (int i = digits.length() - 1; i >= 0; i--) {
            int digit = digits.charAt(i) - '0';
            System.out.print(words[digit] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printNumberInWords(n);

        sc.close();
    }
}
