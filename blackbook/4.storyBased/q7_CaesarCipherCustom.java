public class q7_CaesarCipherCustom {

    public static void main(String[] args) {

        String plaintext = "All the best";
        int key = 1;

        System.out.println(encrypt(plaintext, key));
    }

    public static String encrypt(String text, int key) {

        if (key < 0) {
            return "INVALID INPUT";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                char newChar = (char) ((ch - 'A' + key) % 26 + 'A');
                result.append(newChar);
            }
            // Lowercase letters
            else if (ch >= 'a' && ch <= 'z') {
                char newChar = (char) ((ch - 'a' + key) % 26 + 'a');
                result.append(newChar);
            }
            // Digits
            else if (ch >= '0' && ch <= '9') {
                char newDigit = (char) ((ch - '0' + key) % 10 + '0');
                result.append(newDigit);
            }
            // Special characters
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
