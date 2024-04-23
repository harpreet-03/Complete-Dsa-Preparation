
import java.util.*;

public class Reverse_String {
    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();

        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx++));
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char current = s.pop();
            sb = sb.append(current);
        }

        return str = sb.toString();

    }

    public static void main(String[] args) {
        String str = "abc";

        String res = reverseString(str);
        System.out.println(res);

    }
}
