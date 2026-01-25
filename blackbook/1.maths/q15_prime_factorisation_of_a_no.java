import java.util.Scanner;
public class q15_prime_factorisation_of_a_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=1){
            System.out.println("Invalid input.");
        }
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }

}

