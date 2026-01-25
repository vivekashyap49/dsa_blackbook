public class q7_StringEncryptionUsingKeyCharacter {

    public static void main(String[] args) {

        char[] characters = {'A', 'U', 'T', 'Y'};
        char selected = 'T';
        String text = "CAT";

        encryptString(characters, selected, text);
    }

    public static void encryptString(char[] characters, char selected, String text) {

        // Step 1: Find key
        int key = selected - 'A' + 1;

        System.out.println("Key: " + key);
        System.out.print("Encrypted: ");

        // Step 2: Encrypt string
        for (int i = 0; i < text.length(); i++) {
            int value = (text.charAt(i) - 'A' + 1) + key;
            System.out.print(value);

            if (i != text.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
