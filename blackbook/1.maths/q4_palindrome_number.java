import java.util.Scanner;
public class q4_palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        boolean result = isPalindrome(n);
        System.out.println(result);
        sc.close();
    }
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return temp == rev;
    }
}
