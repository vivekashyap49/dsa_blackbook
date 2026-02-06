import java.util.Scanner;

class InvertedTriangle{
    static String[] invIsoTriangle(int n) {

        String[] result = new String[n];
        int index = 0;

        // Outer loop for rows
        for (int i = n; i >= 1; i--) {

            StringBuilder sb = new StringBuilder();

            // Add leading spaces
            for (int space = 1; space <= n - i; space++) {
                sb.append(" ");
            }

            // Add stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                sb.append("*");
            }

            result[index++] = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = invIsoTriangle(n);

        // Print the pattern
        for (String row : pattern) {
            System.out.println(row);
        }

        sc.close();
    }
}
