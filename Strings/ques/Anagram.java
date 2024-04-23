import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        /*
         * // Convert Strings to lowerca3e.
         * why ? so that we don't have to check seprately for lower uppercase.
         * 
         */
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // first check if lengths are same

        if (s1.length() == s2.length()) {
            char s1array[] = s1.toCharArray();
            char s2array[] = s2.toCharArray();

            Arrays.sort(s1array);
            Arrays.sort(s2array);

            boolean result = Arrays.equals(s1array, s2array);
            if (result) {
                System.out.println(s1 + " and " + s2 + " are " + "anagrams of each other.");
            } else {
                System.out.println(s1 + " and " + s2 + " are not " + "anagrams of each other.");
            }
        } else {
            System.out.println(s1 + " and " + s2 + " are not " + "anagrams of each other.");
        }

    }
}
