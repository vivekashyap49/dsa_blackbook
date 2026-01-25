import java.util.Scanner;
public class q8_isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        sc.close();
    }
    public static boolean isArmstrong(int n){
      int original=n;
      //count digits
      int count=0;
      int temp=n;
      while(temp>0){
          count++;
          temp/=10;
      }
      //sum of powers of digits
        int sum=0;
      temp=n;
      while(temp>0){
          int digit = temp % 10;
          sum+=Math.pow(digit,count);
          temp/=10;
      }
      return sum==original;
    }
}
