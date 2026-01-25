import java.util.ArrayList;
import java.util.Arrays;

public class q12_liftInASociety {
    public static void main(String[] args) {
        int n=5;
        int max=100;
        int[] weight={20,30,10,50,45};
        int ans =maxNoOfPeopleInALift(n,max,weight);
        System.out.println(ans);
    }
    public static int maxNoOfPeopleInALift(int n,int max,int[] arr){
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]<=max){
                count++;
                max=max-arr[i];
            }else{
                break;
            }
        }
        return count;
    }

}
