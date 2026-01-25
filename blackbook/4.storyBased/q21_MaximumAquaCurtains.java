public class q21_MaximumAquaCurtains {

    public static void main(String[] args) {

        String str = "bbbaaababa";
        int L = 3;

        System.out.println(maxAquaCurtains(str, L)); // 3
    }

    public static int maxAquaCurtains(String str, int L) {

        int n = str.length();
        int maxCount = 0;

        for (int i = 0; i < n; i += L) {

            int countA = 0;
            int end = Math.min(i + L, n);

            for (int j = i; j < end; j++) {
                if (str.charAt(j) == 'a') {
                    countA++;
                }
            }

            maxCount = Math.max(maxCount, countA);
        }

        return maxCount;
    }
}
