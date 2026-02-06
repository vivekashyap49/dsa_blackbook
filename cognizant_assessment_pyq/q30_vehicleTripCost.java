import java.util.HashMap;
import java.util.Map;

public class q30_vehicleTripCost {
    public static void main(String[] args) {
        int N = 6;
        String[] vehicles = {"car", "car", "truck", "bike", "bike", "bike"};
        int totalCost = calculateTripCost(N, vehicles);
        System.out.println("Total Trip Cost = " + totalCost);
    }
    public static int calculateTripCost(int n,String[] vehicles){
        Map<String,Integer> countMap = new HashMap<>();
        for(String v : vehicles){
            countMap.put(v, countMap.getOrDefault(v,0)+1);
        }
        int totalCost =0;
        for(String vehicle: countMap.keySet()){
            int count = countMap.get((vehicle));
            int cost =0;
            if(vehicle.equals("car")){
                cost = count *120;
            }else if(vehicle.equals("truck")){
                cost = count *300;
            }else if(vehicle.equals("bike")){
                cost =count *90;
            }
            if(count>=2){
                cost+=200;
            }
            totalCost+=cost;
        }
        return totalCost;
    }
}
