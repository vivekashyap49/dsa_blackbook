public class q64_NumberOfSubstringsContainingAllThreeCharacters {

    public static void main(String[] args) {

        System.out.println(numberOfSubstrings("abcba"));  // 5
        System.out.println(numberOfSubstrings("ccabcc")); // 8
    }

    public static int numberOfSubstrings(String s) {

        int[] freq = new int[3]; // a, b, c
        int left = 0;
        int count = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {

            freq[s.charAt(right) - 'a']++;

            // shrink window while it contains a, b, c
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                count += (n - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}
