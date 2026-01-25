public class q6_EncodingDecoding {

    public static void main(String[] args) {

        String word = "hello";
        String encoded = encode(word);
        System.out.println(encoded);

        String decoded = decode(encoded);
        System.out.println(decoded);
    }

    // Encoding logic
    public static String encode(String word) {

        StringBuilder sb = new StringBuilder();
        int n = word.length();

        for (int i = 0; i < n; i++) {
            int pos = Character.toLowerCase(word.charAt(i)) - 'a' + 1;

            if (i != n - 1) {
                pos += 2;
            }

            sb.append(pos);
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // Decoding logic
    public static String decode(String encoded) {

        String[] tokens = encoded.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tokens.length; i++) {

            int val = Integer.parseInt(tokens[i]);

            if (i != tokens.length - 1) {
                val -= 2;
            }

            char ch = (char) ('a' + val - 1);
            sb.append(ch);
        }
        return sb.toString();
    }
}
