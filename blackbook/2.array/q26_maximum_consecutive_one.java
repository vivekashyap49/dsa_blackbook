import java.util.Scanner;

public class q26_maximum_consecutive_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maximumConsecutiveOne(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int maximumConsecutiveOne(int[] arr){
        int currentCount = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currentCount++;
                maxCount=Math.max(maxCount,currentCount);
            }
            else {
                currentCount=0;
            }
        }
        return maxCount;
    }
}
