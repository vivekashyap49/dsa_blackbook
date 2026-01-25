public class q56_LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str1 = {"flowers", "flow", "fly", "flight"};
        System.out.println(longestCommonPrefix(str1)); // fl

        String[] str2 = {"dog", "cat", "animal", "monkey"};
        System.out.println(longestCommonPrefix(str2)); // ""
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
