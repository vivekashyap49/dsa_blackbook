import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class q21_highest_occuring_element_in_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=HighestOccuringElement(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int HighestOccuringElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        //count frequency
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFreq=0;
        int result=Integer.MAX_VALUE;

        //find max frequency of smallest element
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();

            if(freq>maxFreq || (freq == maxFreq && num < result)){
                maxFreq=freq;
                result=num;
            }
        }
        return result;
    }
}
