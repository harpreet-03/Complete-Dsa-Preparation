package Java_Dsa.Tries.Operations;

public class Triess {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord = false;

        Node() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

        public static Node root = new Node();

        // Insert
        public static void insert(String word) { // O(L)
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Node();
                }
                curr = curr.children[index];
            }
            curr.isEndOfWord = true;
        }

        // Search
        public static boolean search(String word) { // O(L)
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
            }
            return curr.isEndOfWord;
        }
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (String word : words) {
            Node.insert(word);
        }
        System.out.println(Node.search("the")); // true
        System.out.println(Node.search("these")); // false
        System.out.println(Node.search("thor")); // false
    }
}
