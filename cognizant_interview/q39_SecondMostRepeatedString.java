import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q39_SecondMostRepeatedString {

    public static String secondMostRepeated(String[] arr) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequencies
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int firstMax = 0;
        int secondMax = 0;
        String result = "";

        // Find first and second maximum frequencies
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();

            if (freq > firstMax) {
                secondMax = firstMax;
                firstMax = freq;
            } else if (freq > secondMax && freq < firstMax) {
                secondMax = freq;
            }
        }

        // Find string with second maximum frequency
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMax) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(secondMostRepeated(arr));
        sc.close();
    }
}
