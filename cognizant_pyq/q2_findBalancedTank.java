import java.util.Scanner;

public class q2_findBalancedTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String ans= findBalancedTank(n, arr);
        System.out.println(ans);
        sc.close();
    }
    public static String findBalancedTank(int n, String[] tanks){
        int n1=tanks.length;
        int[] values = new int[n1];

        //extract decimal digits
        for(int i=0;i<n1;i++){
            values[i] = tanks[i].charAt(2)-'0';
        }
        //total sum
        int totalSum=0;
        for(int v : values){
            totalSum +=v;
        }
        //check balance point
        int leftSum=0;
        for(int i=0;i<n1;i++){
            int rightSum = totalSum -leftSum -values[i];
            if (leftSum == values[i] + rightSum){
                return tanks[i]; //returning string value
            }
            leftSum +=values[i];
        }
        return "-1"; //no such tank
    }
}
