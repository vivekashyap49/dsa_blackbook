import java.util.HashMap;
import java.util.Map;

public class q3_OddColourBalloon {

    public static void main(String[] args) {

        int N = 7;
        char[] B = {'r', 'g', 'b', 'b', 'g', 'y', 'y'};

        findOddColour(N, B);
    }

    public static void findOddColour(int N, char[] B) {

        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (char ch : B) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Find first colour with odd frequency
        for (char ch : B) {
            if (freqMap.get(ch) % 2 != 0) {
                System.out.println(ch);
                return;
            }
        }

        // If all are even
        System.out.println("All are even");
    }
}
