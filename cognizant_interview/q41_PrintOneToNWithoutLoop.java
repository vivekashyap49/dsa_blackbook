import java.util.Scanner;

public class q41_PrintOneToNWithoutLoop {

    public static void printNumbers(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Print after recursion
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printNumbers(n);

        sc.close();
    }
}
