import java.util.Scanner;
public class q12_gcd_of_2_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans1=gcd1(n1,n2);
        System.out.println(ans1);
        int ans2=gcd2(n1,n2);
        System.out.println(ans2);
    }
    public static int gcd1(int a,int b){
        while(b !=0){
            int rem = a % b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static int gcd2(int a,int b){
        if(b==0) return a;
        return gcd2(b,a%b);
    }

}

