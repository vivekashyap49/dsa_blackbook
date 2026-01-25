public class q2_BalancedTank {
    public static String BalancedTank(int N, String[] tanks){
        int[] values = new int[N];
        //extract the digit after decimal
        for(int i=0;i<N;i++){
            values[i]=tanks[i].charAt(2) - '0';
        }
        //calculate total sum
        int totalSum =0;
        for(int i=0;i<N;i++){
            totalSum += values[i];
        }
        int leftSum =0;
        for(int i=0;i<N;i++){
            int rightSum = totalSum -leftSum -values[i];
            if(leftSum == values[i] + rightSum){
                return tanks[i]; //return string value
            }
            leftSum += values[i];
        }
        return "-1";
    }

    public static void main(String[] args) {
        int N =5;
        String[] tanks ={"0.2","0.3","0.1","0.2","0.2"};
        String ans = BalancedTank(N, tanks);
        System.out.println(ans);
    }
}
