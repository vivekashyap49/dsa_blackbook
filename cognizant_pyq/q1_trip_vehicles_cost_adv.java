import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class q1_trip_vehicles_cost_adv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int result=TripCost(n, arr);
        System.out.println(result);
        sc.close();
    }
    public static int TripCost(int n, String[] vehicles){
        Map<String,Integer> countMap = new HashMap<>();

        //count vehicle usage
        for(String v : vehicles){
            countMap.put(v,countMap.getOrDefault(v,0)+1);
        }
        int totalCost =0;

        //calculate cost vehicle-wise
        for(String v :countMap.keySet()){
            int count = countMap.get(v);
            int cost = 0;
            if(v.equals("car")){
                cost = count *120;
            }else if(v.equals("truck")){
                cost = count *300;
            }else if(v.equals("bike")){
                cost=count *90;
            }

            //apply penalty
            if(count >=2){
                cost += 200;
            }
            totalCost += cost;
        }
        return totalCost;
    }
}
