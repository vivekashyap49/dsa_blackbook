public class q15_specialSubArrrayCount {
    public static void main(String[] args) {
        int[] arr ={3,1,5,4,3,6,3};
        int ans=countSpecialSubArray(arr);
        System.out.println(ans);
    }
    public static int countSpecialSubArray(int[] arr){
        int count =0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
