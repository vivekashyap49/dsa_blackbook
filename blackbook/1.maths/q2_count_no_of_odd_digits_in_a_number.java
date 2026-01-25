import java.util.Scanner;
public class q2_count_no_of_odd_digits_in_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int result=countOddDigits(n);
        System.out.println("Number of odd digits: "+result);
        sc.close();
    }
    public static int countOddDigits(int n){
        int count =0;
        while(n>0){
            int digit = n % 10;
            if(digit % 2 !=0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
