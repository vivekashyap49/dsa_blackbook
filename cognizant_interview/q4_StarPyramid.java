import java.util.Scanner;

public class q4_StarPyramid {

    public static void printTriangle(int n) {
        // Loop for rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        int n = sc.nextInt();

        // Print the pattern
        printTriangle(n);

        sc.close();
    }
}
