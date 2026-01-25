import java.util.Scanner;
import java.util.Vector;

public class q20_reverse_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
