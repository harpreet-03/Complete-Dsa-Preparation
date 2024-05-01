public class J02_Anagram {

    public static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if the lengths are different, if so, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Create a character frequency array for the first string
        int[] charFreq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            charFreq[a.charAt(i) - 'a']++;
        }

        // Check if the second string has the same character frequencies
        for (int i = 0; i < b.length(); i++) {
            charFreq[b.charAt(i) - 'a']--;
        }

        // If all character frequencies are zero, the strings are anagrams
        for (int freq : charFreq) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world")); // false
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("iceman", "cinema")); // true
        System.out.println(isAnagram("apple", "papel")); // true
        System.out.println(isAnagram("rat", "car")); // false
    }
}
