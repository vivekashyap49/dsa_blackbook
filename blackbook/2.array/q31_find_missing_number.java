import java.util.Scanner;

public class q31_find_missing_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=findMissingNo(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int findMissingNo(int[] arr){
        int n=arr.length;
        int sum=0;
        int expectedSum = n*(n+1)/2;
        int result=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return result=expectedSum-sum;
    }
}
