public class q14_ThreePalindromeSplit {

    public static void main(String[] args) {

        String word = "nayannamantenet";
        splitIntoThreePalindromes(word);
    }

    public static void splitIntoThreePalindromes(String s) {

        int n = s.length();

        for (int i = 0; i < n - 2; i++) {

            if (isPalindrome(s, 0, i)) {

                for (int j = i + 1; j < n - 1; j++) {

                    if (isPalindrome(s, i + 1, j) &&
                            isPalindrome(s, j + 1, n - 1)) {

                        System.out.println(s.substring(0, i + 1));
                        System.out.println(s.substring(i + 1, j + 1));
                        System.out.println(s.substring(j + 1));
                        return;
                    }
                }
            }
        }

        System.out.println("Impossible");
    }

    private static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
