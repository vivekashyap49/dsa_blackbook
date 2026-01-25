import java.util.*;
public class q1_trip_vehicles_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int result=totalTripCost(n, arr);
        System.out.println(result);
        sc.close();
    }
    public static int totalTripCost(int N,String[] vehicles){
        Map<String,Integer> countMap = new HashMap<>();
        //count vehicle usage(normal for loop)
        for(int i=0;i<N;i++){
            String v = vehicles[i];
            countMap.put(v,countMap.getOrDefault(v,0)+1);
        }
        int totalCost =0;
        //calculate cost(normal loop using keySet array)
        String[] keys = countMap.keySet().toArray(new String[0]);
        for(int i=0;i<keys.length;i++){
            String v = keys[i];
            int count= countMap.get(v);
            int cost=0;

            if(v.equals(("car"))){
                cost=count *120;
            }
            else if(v.equals("truck")){
                cost=count*300;
            }
            else if(v.equals("bike")){
                cost=count *90;
            }
            //penalty
            if(count >=2){
                cost +=200;
            }
            totalCost += cost;
        }
        return totalCost;
    }

}
