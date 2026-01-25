import java.util.Scanner;
public class q18_count_of_odd_no_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=countOddNo(arr);
        System.out.println(ans);

    }
    public static int countOddNo(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        return count;
    }

}
