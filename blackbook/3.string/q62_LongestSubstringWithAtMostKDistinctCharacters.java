import java.util.HashMap;
import java.util.Map;

public class q62_LongestSubstringWithAtMostKDistinctCharacters {

    public static void main(String[] args) {

        System.out.println(longestSubstring("aababbcaacc", 2)); // 6
        System.out.println(longestSubstring("abcddefg", 3));    // 4
    }

    public static int longestSubstring(String s, int k) {

        if (k == 0 || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // shrink window if distinct characters exceed k
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
