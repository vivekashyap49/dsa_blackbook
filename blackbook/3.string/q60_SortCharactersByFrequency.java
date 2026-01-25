import java.util.*;

public class q60_SortCharactersByFrequency {

    public static void main(String[] args) {

        String s = "tree";
        System.out.println(sortByFrequency(s)); // [e, r, t]
    }

    public static List<Character> sortByFrequency(String s) {

        // Step 1: Frequency count
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Store unique characters
        List<Character> chars = new ArrayList<>(freqMap.keySet());

        // Step 3: Sort with custom comparator
        Collections.sort(chars, (a, b) -> {
            if (freqMap.get(a) != freqMap.get(b)) {
                return freqMap.get(b) - freqMap.get(a); // descending frequency
            }
            return a - b; // alphabetical order
        });

        return chars;
    }
}
