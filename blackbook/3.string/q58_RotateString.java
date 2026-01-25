public class q58_RotateString {

    public static void main(String[] args) {

        System.out.println(rotateString("abcde", "cdeab")); // true
        System.out.println(rotateString("abcde", "abced")); // false
    }

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String temp = s + s;
        return temp.contains(goal);
    }
}
