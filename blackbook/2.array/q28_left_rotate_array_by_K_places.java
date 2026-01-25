import java.util.Scanner;

public class q28_left_rotate_array_by_K_places {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        leftRotateArrayByK(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void leftRotateArrayByK(int[] arr,int k){
        int n=arr.length;
        if(n==0) return;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
