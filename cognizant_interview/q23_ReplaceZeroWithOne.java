import java.util.Scanner;

public class q23_ReplaceZeroWithOne {

    public static int replaceZeroWithOne(int n) {

        if (n == 0) {
            return 1;
        }

        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0) {
                digit = 1;
            }

            result = result + digit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(replaceZeroWithOne(n));

        sc.close();
    }
}
