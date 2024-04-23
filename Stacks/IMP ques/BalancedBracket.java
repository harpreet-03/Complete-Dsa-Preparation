import java.util.*;

public class BalancedBracket {

    public static boolean isBalance(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "()[{}()]";
        if (isBalance(s)) {
            System.out.println("is Balance: True");
        } else {
            System.out.println("is Balance: False");
        }
    }
}
