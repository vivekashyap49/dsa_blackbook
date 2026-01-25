public class q16_countMiniBoxes {
    public static void main(String[] args) {
        int input1 = 4;
        int input2 = 5;
        int[] input3 = {1, 3, 5, 8};
        int ans = countMiniBoxes(input1, input2, input3);
        System.out.println(ans);
    }
    public static int countMiniBoxes(int n, int X, int[] A ){
        int left = 0;
        int right = n-1;
        int count = 0;

        while(left <= right){
            if(A[left]+A[right]<=X){
                count += (right-left+1);
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
