import java.util.HashMap;
import java.util.Map;

public class q27_FakePalindromeSubstrings {

    public static void main(String[] args) {

        String S1 = "ABAB";
        System.out.println(countFakePalindromes(S1)); // 7

        String S2 = "AAA";
        System.out.println(countFakePalindromes(S2)); // 6
    }

    public static long countFakePalindromes(String s) {

        Map<Integer, Integer> map = new HashMap<>();
        int mask = 0;
        long count = 0;

        // Empty prefix
        map.put(0, 1);

        for (char ch : s.toCharArray()) {

            // Toggle bit
            mask ^= (1 << (ch - 'A'));

            // Case 1: same mask
            count += map.getOrDefault(mask, 0);

            // Case 2: mask differs by one bit
            for (int i = 0; i < 26; i++) {
                int toggled = mask ^ (1 << i);
                count += map.getOrDefault(toggled, 0);
            }

            // Update frequency
            map.put(mask, map.getOrDefault(mask, 0) + 1);
        }

        return count;
    }
}
