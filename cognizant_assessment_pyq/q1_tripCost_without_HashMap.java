public class q1_tripCost_without_HashMap {
    public static int totalTripCost(int N, String[] vehicles) {

            // Counters
            int carCount = 0;
            int truckCount = 0;
            int bikeCount = 0;

            // Count vehicle usage
            for (int i = 0; i < N; i++) {
                if (vehicles[i].equals("car")) {
                    carCount++;
                } else if (vehicles[i].equals("truck")) {
                    truckCount++;
                } else if (vehicles[i].equals("bike")) {
                    bikeCount++;
                }
            }

            int totalCost = 0;

            // Car cost
            if (carCount > 0) {
                totalCost += carCount * 120;
                if (carCount >= 2) {
                    totalCost += 200; // penalty
                }
            }

            // Truck cost
            if (truckCount > 0) {
                totalCost += truckCount * 300;
                if (truckCount >= 2) {
                    totalCost += 200; // penalty
                }
            }

            // Bike cost
            if (bikeCount > 0) {
                totalCost += bikeCount * 90;
                if (bikeCount >= 2) {
                    totalCost += 200; // penalty
                }
            }
            return totalCost;
    }
    public static void main(String[] args) {
        int N = 6;
        String[] vehicles = {"car", "car", "truck", "bike", "bike", "bike"};
        int result = totalTripCost(N, vehicles);
        System.out.println("Total Trip Cost = " + result);
    }
}
