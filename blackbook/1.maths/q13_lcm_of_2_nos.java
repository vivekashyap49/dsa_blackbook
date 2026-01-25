import java.util.Scanner;
public class q13_lcm_of_2_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=n1*n2/gcd(n1,n2);
        System.out.println(lcm);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}


