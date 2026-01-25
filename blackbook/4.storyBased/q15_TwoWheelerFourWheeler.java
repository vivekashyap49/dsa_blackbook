public class q15_TwoWheelerFourWheeler {

    public static void main(String[] args) {

        int V = 200;
        int W = 540;

        calculateVehicles(V, W);
    }

    public static void calculateVehicles(int V, int W) {

        // Constraint validation
        if (W < 2 || W % 2 != 0 || V >= W) {
            System.out.println("INVALID INPUT");
            return;
        }

        int FW = (W - 2 * V) / 2;
        int TW = V - FW;

        if (FW < 0 || TW < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        System.out.println("TW =" + TW + " FW=" + FW);
    }
}
