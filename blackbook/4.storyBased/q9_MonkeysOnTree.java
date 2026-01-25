public class q9_MonkeysOnTree {

    public static void main(String[] args) {

        int n = 20;
        int k = 2;
        int j = 3;
        int m = 12;
        int p = 12;

        monkeysLeft(n, k, j, m, p);
    }

    public static void monkeysLeft(int n, int k, int j, int m, int p) {

        // Invalid input check
        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int monkeysByBananas = m / k;
        int monkeysByPeanuts = p / j;

        int monkeysWhoAte = monkeysByBananas + monkeysByPeanuts;

        int result;
        if (monkeysWhoAte >= n) {
            result = 0;
        } else {
            result = n - monkeysWhoAte;
        }

        // Strict output format
        System.out.println("Number of Monkeys left on the Tree:" + result);
    }
}
