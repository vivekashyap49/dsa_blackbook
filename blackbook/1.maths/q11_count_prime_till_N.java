import java.util.Scanner;
public class q11_count_prime_till_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=countPrime(n);
        System.out.println(ans);
        sc.close();
    }
    public static int countPrime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
