import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q33_intersection_of_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> ans = findIntersection(arr1,arr2);
        for(int val: ans){
            System.out.println(val + " ");
        }
        sc.close();
    }
    public static ArrayList<Integer> findIntersection(int[] arr1,
    int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        int n=arr1.length;
        int m= arr2.length;
        //traverse both arrays
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                //common element found
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
