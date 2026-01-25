public class q8_waterTank {
    public static void main(String[] args) {
        int m=5;
        String[] input = {"0.5", "0.5", "0.2", "0.1", "0.7"};
        System.out.println(findBalancedIndex(m,input));
    }
    public static String findBalancedIndex(int n,String [] tanks){
        int totalSum = 0;
        //totalSum
        for(int i=0;i<n;i++){
            int value = tanks[i].charAt(2)-'0';
            totalSum += value;
        }
        int leftSum =0;
        for(int i=0;i<n;i++){
            int current = tanks[i].charAt(2) - '0';
            int rightSum = totalSum -leftSum - current;
            if(leftSum == current + rightSum){
                return String.valueOf(i);
            }
            leftSum += current;
        }
        return  "-1";
    }
}
