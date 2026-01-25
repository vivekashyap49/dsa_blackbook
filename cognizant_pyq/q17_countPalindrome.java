public class q17_countPalindrome {
    public static void main(String[] args) {
        int M =100;
        String s="a?a";
        int ans=countPalindrome(M,s);
        System.out.println(ans);
    }
    public static int countPalindrome(int M,String s){
        int n=s.length();
        int left =0;
        int right =n-1;
        long ways =1;
        while(left<=right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(l==r){
                if(l=='?'){
                    ways=(ways*26)%M;
                }
            }else{
                if(l=='?'||r=='?'){

                }else{
                    return 0;
                }
            }
            left++;
            right--;
        }
        //middle character handling (odd length string)
        if(left==right && s.charAt(left)=='?'){
            ways=(ways*26)%M;
        }
        return (int) ways;

    }

}
