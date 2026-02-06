import java.util.*;

class UserMainCode {

    public int totalCost(int input1, int[] input2) {

        int n = input1;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            int x = input2[i];

            int k = (int) Math.sqrt(x);
            int lower = k * k;
            int upper = (k + 1) * (k + 1);

            int costLower = Math.abs(x - lower);
            int costUpper = Math.abs(upper - x);

            if (costLower < costUpper) {
                totalCost += costLower;
            } else {
                totalCost += costUpper;
            }
        }

        return totalCost;
    }
}
