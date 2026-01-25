import java.util.Scanner;
public class q9_isPerfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isPerfect(n)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        sc.close();
    }
    public static boolean isPerfect(int n){
        if(n<=1) return false;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }

}
