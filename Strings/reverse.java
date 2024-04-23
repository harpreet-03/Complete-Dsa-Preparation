public class reverse {
    // Function to reverse a string
    public static String reverseWord(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Swapping characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        // Creating a new string from the reversed charArray
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseWord(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
