public class q5_CircularArrayVanishedKriyas {

    public static void main(String[] args) {

        int n1 = 4, x1 = 2;
        System.out.println(countVanishedKriyas(n1, x1)); // 2

        int n2 = 10, x2 = 1;
        System.out.println(countVanishedKriyas(n2, x2)); // 2
    }

    public static int countVanishedKriyas(int n, int x) {

        if (n <= 1) {
            return 0;
        }

        // In circular array, every element has exactly 2 neighbors
        return 2;
    }
}
