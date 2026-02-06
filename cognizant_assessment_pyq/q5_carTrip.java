import java.util.*;
public class q5_carTrip {
    public static void main(String[] args) {
        int N = 3;
        int[] A = {4, 5, 7};
        int[] C = {7, 6, 7};
        int result = minCarTrip(N, A, C);
        System.out.println(result);
    }
    public static int minCarTrip(int N,int[] A,int[] C){
        int totalMembers =0;
        List<Integer>validCars = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(A[i]>2){
                totalMembers+=A[i];
                validCars.add(C[i]);
            }
        }
        if(totalMembers==0){
            return -1;
        }
        int carUsed =0;
        int remainingMembers = totalMembers;
        for(int seats : validCars){
            remainingMembers-=seats;
            carUsed++;
        }
        if(remainingMembers<=0){
            return carUsed;
        }
        return -1; //not enough seats
    }
}
