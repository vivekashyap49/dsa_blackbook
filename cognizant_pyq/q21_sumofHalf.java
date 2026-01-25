public class q21_sumofHalf {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        sumOfHalfArray(arr);
    }
    public static void sumOfHalfArray(int[] arr){
        int n=arr.length;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<n/2;i++){
            leftSum+=arr[i];
        }
        for(int i=n/2;i<n;i++){
            rightSum+=arr[i];
        }
        if(leftSum < rightSum){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
