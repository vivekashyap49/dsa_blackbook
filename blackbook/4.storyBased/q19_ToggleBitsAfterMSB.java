public class q19_ToggleBitsAfterMSB {

    public static void main(String[] args) {

        int N = 10;
        System.out.println(toggleBits(N)); // 5
    }

    public static int toggleBits(int N) {

        // Find number of bits
        int bits = Integer.toBinaryString(N).length();

        // Create mask with all bits set to 1
        int mask = (1 << bits) - 1;

        // Toggle bits using XOR
        return N ^ mask;
    }
}
