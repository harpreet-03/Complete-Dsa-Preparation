
/*
Statement:
---------

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

s = "race" t = "care"     TRUE
s = "heart" t = "earth"    TRUE
s = "tulip"  t = "lipid"    FALSE

*/
import java.util.*;

public class Valid_Anagram {
    public static boolean isValidAnagram(String s, String t) { // O(n) where n is the number of characters in a string
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isValidAnagram(s, t));
    }
}