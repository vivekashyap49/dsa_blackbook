import java.util.HashMap;
import java.util.Map;

public class q57_IsomorphicStrings {

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false;
                }
            } else {
                if (mapTS.containsKey(c2)) {
                    return false;
                }
                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}
