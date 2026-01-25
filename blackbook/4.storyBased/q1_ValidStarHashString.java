public class q1_ValidStarHashString {

    public static void main(String[] args) {

        String s1 = "###***";
        System.out.println(findMinimumChanges(s1)); // 0

        String s2 = "**#";
        System.out.println(findMinimumChanges(s2)); // 1

        String s3 = "####*";
        System.out.println(findMinimumChanges(s3)); // -3
    }

    public static int findMinimumChanges(String s) {

        int starCount = 0;
        int hashCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                starCount++;
            } else if (s.charAt(i) == '#') {
                hashCount++;
            }
        }

        return starCount - hashCount;
    }
}
