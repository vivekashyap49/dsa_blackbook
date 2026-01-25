import java.util.Scanner;

public class q25_second_largest_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=secondLargestElement(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int secondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] >secondLargest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
}
