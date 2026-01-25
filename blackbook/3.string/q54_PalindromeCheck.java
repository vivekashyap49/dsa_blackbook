public class q54_PalindromeCheck {

    public static void main(String[] args) {

        String s1 = "hannah";
        System.out.println(isPalindrome(s1)); // true

        String s2 = "aabbaaa";
        System.out.println(isPalindrome(s2)); // false
    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

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
