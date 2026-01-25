import java.util.Scanner;
public class q3_reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int result = reverseNumber(n);
        System.out.println("Reversed number: "+result);
        sc.close();
    }
    public static int reverseNumber(int n){
        int rev =0;
        while(n>0){
            int digit = n% 10;
            rev = rev*10 + digit;
            n=n/10;
        }
        return rev;
    }

}
