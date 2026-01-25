import java.util.Scanner;

public class q27_left_rotate_array_by_One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leftRotateArrayByOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
    public static void leftRotateArrayByOne(int[] arr){
        if(arr.length<=1) return;
        int firstElement=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=firstElement;
    }
}
