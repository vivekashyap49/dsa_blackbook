import java.util.Scanner;
public class q16_countPrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int ans=countPrime(r)-countPrime(l-1);
        System.out.println(ans);
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
    public static int countPrime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

}
