public class q10_SortItemsByRiskSeverity {

    public static void main(String[] args) {

        int N = 7;
        int[] arr = {1, 0, 2, 0, 1, 0, 2};

        sortRiskLevels(arr, N);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortRiskLevels(int[] arr, int N) {

        int low = 0;
        int mid = 0;
        int high = N - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
