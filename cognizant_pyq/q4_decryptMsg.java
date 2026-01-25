public class q4_decryptMsg {
    public static void main(String[] args) {
        String S = "9818jio5gide2g";
        String output = decryptMsg(S);
        System.out.println(output);
        String s = "pr1ogr4a556mm6i0ng011";
        String ans = decryptMsg(s);
        System.out.println(ans);
    }
    public static String decryptMsg(String s){
        StringBuilder result = new StringBuilder();
        boolean isAlphaNum = true;
        int i=0;
        while(i<s.length()-1){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if(isAlphaNum){
                if(Character.isLetter(first) && Character.isDigit(second)){
                    result.append(first).append(second);
                    isAlphaNum=false;
                    i+=2;
                }else{
                    i++;
                }
            }else{
                if(Character.isDigit(first) && Character.isLetter(second)){
                    result.append(first).append(second);
                    isAlphaNum = true;
                    i+=2;
                }else{
                    i++;
                }
            }
        }
        return result.toString();
    }
}
