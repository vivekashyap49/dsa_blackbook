import java.util.Scanner;
public class q0_input_templete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int ans=FunctionName(n);
        System.out.println(ans);
    }
    public static int FunctionName(int n){
        return 0;
    }

}
