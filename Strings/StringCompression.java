public class StringCompression {

    public static String strCompression(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 1; // Initialize the count to 1 for the first character

        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is the same as the next character
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Append the current character and its count to the compressed string
                compressed.append(s.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                // Reset the count for the next character
                count = 1;
            }
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbcccdd";
        System.out.println(strCompression(s));
    }
}
