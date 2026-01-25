public class q55_LargestOddNumber {

    public static void main(String[] args) {

        String s1 = "5347";
        System.out.println(largestOddNumber(s1)); // 5347

        String s2 = "0214638";
        System.out.println(largestOddNumber(s2)); // 21463
    }

    public static String largestOddNumber(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {

            int digit = s.charAt(i) - '0';

            // check if digit is odd
            if (digit % 2 == 1) {
                return s.substring(0, i + 1);
            }
        }

        // no odd digit found
        return "";
    }
}
