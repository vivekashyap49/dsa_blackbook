import java.util.Scanner;

public class q3_PatternTriangle {
    public static void printTriangle(int n) {
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int n = sc.nextInt();

        // Printing the pattern
        printTriangle(n);

        sc.close();
    }
}
