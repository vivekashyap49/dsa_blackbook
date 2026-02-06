import java.util.Scanner;

public class q0_format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=functionName(arr);
        System.out.println(result);
        sc.close();
    }
    public static int functionName(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }
}
