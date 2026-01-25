public class q17_WashingMachineTimeEstimation {

    public static void main(String[] args) {

        int weight = 2000;
        estimateTime(weight);
    }

    public static void estimateTime(int weight) {

        if (weight < 0) {
            System.out.println("INVALID INPUT");
        }
        else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        }
        else if (weight > 7000) {
            System.out.println("OVERLOADED");
        }
        else if (weight <= 2000) {
            System.out.println("Time Estimated: 25 minutes");
        }
        else if (weight <= 4000) {
            System.out.println("Time Estimated: 35 minutes");
        }
        else {
            System.out.println("Time Estimated: 45 minutes");
        }
    }
}
