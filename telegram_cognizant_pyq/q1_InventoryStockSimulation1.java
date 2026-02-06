public class q1_InventoryStockSimulation1{
    public static int[] simulateStock(int N, int[] A, int[] R, int T, int X) {
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int remaining = A[i] - (R[i] * T);
            result[i] = Math.max(remaining, X);
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] A = {100, 80, 60};
        int[] R = {5, 10, 20};
        int T = 3;
        int X = 20;

        int[] finalStock = simulateStock(N, A, R, T, X);

        for (int stock : finalStock) {
            System.out.print(stock + " ");
        }
    }
}
