import java.util.*;

public class q19_uniqueAirportCodes {
    public static void main(String[] args) {
        String s = "ABCZABCADDAC";

        System.out.println(uniqueAirportCodes(s)); // Output: 3
    }
    public static int uniqueAirportCodes(String s){
        int n=s.length();
        if(n%3!=0){
            return -1;
        }
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i+=3){
            String part =s.substring(i,i+3);
            char[] ch = part.toCharArray();
            Arrays.sort(ch);
            //set.add(String.valueOf(ch));
            set.add(new String(ch));
        }
        return set.size();
    }
}
