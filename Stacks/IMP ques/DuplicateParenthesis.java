
import java.util.*;

/*
Given a balanced expression, find if it contains duplicate parentheses or not. A set of
parentheses are duplicate if the same subexpression is surrounded by multiple
parentheses.
Return a true if it contains duplicates else return false.


*/
public class DuplicateParenthesis {

    public static boolean isDuplicate(String s) {
        Stack<Character> st= new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == ')') {
                int cnt = 0;

                while(st.pop() != '(') {
                    
                    cnt++;
                }

                if(cnt < 1) return true;
                

            }else st.push(ch);

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((((((a + b))))"; // true
        String str2 = "(a-b)"; // false

        System.out.println(isDuplicate(str));
    }
}

/*
 * Slightly different for loop:
 * 
 * for(char ch : s.toCharArray()) {
 * if(ch == ')') {
 * int cnt = 0;
 * 
 * while(st.peek() != '(') {
 * st.pop();
 * cnt++;
 * }
 * 
 * if(cnt < 1) return true;
 * else st.pop();
 * 
 * }else st.push(ch);
 * 
 * }
 * return false;
 * 
 */