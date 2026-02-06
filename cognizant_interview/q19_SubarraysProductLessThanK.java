import java.util.Scanner;

public class q19_SubarraysProductLessThanK {

    public static int countSubarrays(int[] arr, int k) {

        if (k <= 1) {
            return 0;
        }

        int product = 1;
        int left = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            product *= arr[right];

            while (product >= k) {
                product /= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(countSubarrays(arr, k));
        sc.close();
    }
}
