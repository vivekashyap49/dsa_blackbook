import java.util.Scanner;
public class q1_count_all_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = countDigits(n);
        System.out.println("Number of digits: "+result);
        sc.close();
    }
    public static int countDigits(int n){
        if(n==0){
            return 1;
        }
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
