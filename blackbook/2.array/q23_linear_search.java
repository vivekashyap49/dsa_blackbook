import java.util.Scanner;
public class q23_linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int ans=linearSearch(arr,target);
        System.out.println(ans);
        sc.close();
    }
    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
