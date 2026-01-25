import java.util.HashMap;
import java.util.Map;

public class q63_MinimumWindowSubstring {

    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // BANC
        System.out.println(minWindow("a", "a"));               // a
    }

    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int formed = 0;
        int required = tMap.size();

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (tMap.containsKey(ch) &&
                    windowMap.get(ch).intValue() == tMap.get(ch).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (tMap.containsKey(leftChar) &&
                        windowMap.get(leftChar) < tMap.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(startIndex, startIndex + minLen);
    }
}
