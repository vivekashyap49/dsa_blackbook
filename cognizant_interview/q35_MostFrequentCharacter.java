import java.util.Scanner;

public class q35_MostFrequentCharacter {

    public static char mostFrequentChar(String str) {

        int[] freq = new int[256];

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxFreq = 0;
        char result = str.charAt(0);

        // Find first character with maximum frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(mostFrequentChar(str));

        sc.close();
    }
}
