public class q59_ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("dog", "cat"));         // false
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
