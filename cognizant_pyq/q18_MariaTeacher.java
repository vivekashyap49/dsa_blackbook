public class q18_MariaTeacher {
    public static void main(String[] args) {
        int A =10;
        int X=2;
        int ans = prefixSumByX(A,X);
        System.out.println(ans);
    }
    public static int prefixSumByX(int A,int X){
        int ans=0;
        //adjacent sum
        for(int i=1;i<A;i++){
            int sum=i+(i+1);
            if(sum % X == 0){
                ans+=sum;
            }
        }
        int lastSum=A+1;
        if(lastSum % X == 0){
            ans+=lastSum;
        }
        return ans;
    }
}
