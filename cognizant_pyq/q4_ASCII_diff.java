public class q4_ASCII_diff {
    public static void main(String[] args) {
        int N =5;
        String[] W = {"Einstein", "James", "newton", "Charlie", "GRAHAM"};
        String result = HighestAndLowestASCII(N, W);
        System.out.println(result);
        int n=4;
        String[] arr = {"Sam","Peter","Adam","John"};
        String ans=HighestAndLowestASCII(n,arr);
        System.out.println(ans);
    }
    public static String HighestAndLowestASCII(int N, String[] W){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        String maxWord="";
        String minWord="";

        for(int i=0;i<N;i++){
            String word = W[i];
            int sum =0;
            for(int j=0;j<word.length();j++){
                sum += word.charAt(j);
            }
            if(sum > maxSum){
                maxSum=sum;
                maxWord=word;
            }
            if(sum<minSum){
                minSum= sum;
                minWord= word;
            }
        }
        return  maxWord+" "+minWord;
    }
}
