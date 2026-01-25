import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class q34_leaders_in_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> leaders = findLeaders(arr);
        for(int val:leaders){
            System.out.print(val + " ");
        }
        sc.close();
    }
    public static ArrayList<Integer> findLeaders(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]> maxFromRight){
                result.add(arr[i]);
                maxFromRight=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
