import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class q22_second_highest_occuring_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=secondHighestOccuringElement(arr);
        System.out.println(ans);
        sc.close();
    }
    public static int secondHighestOccuringElement(int[] arr){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int maxFreq =0;
        for(int freq : map.values()){
            if(freq > maxFreq){
                maxFreq = freq;
            }
        }
        int secondMaxFreq =0;
        for(int freq : map.values()){
            if(freq <maxFreq && freq > secondMaxFreq){
                secondMaxFreq = freq;
            }
        }
        if(secondMaxFreq==0){
            return -1;
        }
        int result = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==secondMaxFreq){
                result= Math.min(result,entry.getKey());
            }
        }
        return result;
    }

}
