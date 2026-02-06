import java.util.Scanner;

public class q38_UncommonCharacters {

    public static void printUncommonCharacters(String s1, String s2) {

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequency of characters in s1
        for (char ch : s1.toCharArray()) {
            freq1[ch]++;
        }

        // Count frequency of characters in s2
        for (char ch : s2.toCharArray()) {
            freq2[ch]++;
        }

        boolean found = false;

        // Traverse ASCII characters
        for (int i = 0; i < 256; i++) {
            if ((freq1[i] > 0 && freq2[i] == 0) ||
                    (freq1[i] == 0 && freq2[i] > 0)) {
                System.out.print((char) i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        printUncommonCharacters(s1, s2);

        sc.close();
    }
}
