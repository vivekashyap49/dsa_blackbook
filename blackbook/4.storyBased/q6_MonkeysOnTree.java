public class q6_MonkeysOnTree {

    public static void main(String[] args) {

        int n = 10; // total monkeys
        int m = 25; // bananas
        int p = 10; // peanuts
        int k = 2;  // bananas per monkey
        int j = 1;  // peanuts per monkey

        System.out.println(monkeysLeft(n, m, p, k, j));
    }

    public static int monkeysLeft(int n, int m, int p, int k, int j) {

        int monkeysByBananas = m / k;
        int monkeysByPeanuts = p / j;

        int monkeysWhoAte = monkeysByBananas + monkeysByPeanuts;

        if (monkeysWhoAte >= n) {
            return 0;
        }

        return n - monkeysWhoAte;
    }
}
