import java.util.HashSet;
import java.util.Scanner;

public class q12_RemoveDuplicatesFromUnsortedArray {

    public static boolean isSubset(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // Store elements of arr1
        for (int num : arr1) {
            set.add(num);
        }

        // Check elements of arr2
        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        if (isSubset(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
