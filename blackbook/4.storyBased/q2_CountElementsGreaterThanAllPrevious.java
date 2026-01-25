public class q2_CountElementsGreaterThanAllPrevious {

    public static void main(String[] args) {

        int N = 5;
        int[] Arr = {7, 4, 8, 2, 9};

        System.out.println(countGreaterElements(N, Arr)); // 3
    }

    public static int countGreaterElements(int N, int[] Arr) {

        int count = 1; // first element is always counted
        int maxSoFar = Arr[0];

        for (int i = 1; i < N; i++) {
            if (Arr[i] > maxSoFar) {
                count++;
                maxSoFar = Arr[i];
            }
        }

        return count;
    }
}
