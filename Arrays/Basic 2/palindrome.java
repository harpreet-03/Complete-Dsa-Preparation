/*How to check if a String is
a Palindrome or not

Example— Given string — "madam"
Solution — It should return - true

Example— Given string — "that"
Solution — It should return - false

 */

public class palindrome {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = s.length()-1;

        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        String arr = "thatlll";
        boolean res = isPalindrome(arr);
        System.out.println("Is Palindrome: " + res);
    }
}
