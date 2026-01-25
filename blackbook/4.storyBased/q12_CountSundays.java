import java.util.HashMap;
import java.util.Map;

public class q12_CountSundays {

    public static void main(String[] args) {

        String startDay = "mon";
        int n = 13;

        System.out.println(countSundays(startDay, n)); // 2
    }

    public static int countSundays(String startDay, int n) {

        Map<String, Integer> dayIndex = new HashMap<>();
        dayIndex.put("sun", 0);
        dayIndex.put("mon", 1);
        dayIndex.put("tue", 2);
        dayIndex.put("wed", 3);
        dayIndex.put("thu", 4);
        dayIndex.put("fri", 5);
        dayIndex.put("sat", 6);

        int start = dayIndex.get(startDay.toLowerCase());

        // Days until first Sunday
        int daysToFirstSunday = (7 - start) % 7;

        // If first Sunday is beyond n days
        if (daysToFirstSunday >= n) {
            return 0;
        }

        int remainingDays = n - daysToFirstSunday - 1;

        return 1 + (remainingDays / 7);
    }
}
