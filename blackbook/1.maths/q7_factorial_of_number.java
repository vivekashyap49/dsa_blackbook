import java.util.Scanner;
public class q7_factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int ans=factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
}
