import java.util.*;

public class palindrome {

    public static boolean Palindrome_str(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if ((str.charAt(i)) == (str.charAt(n - i - 1))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // check if a string is Palindrome
        // madam, noon, racecar

        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = Palindrome_str(str);
        if (result != true) {
            System.out.println("String is not  a Palindrome");
        } else {
            System.out.println("String is  a Palindrome");
        }
    }
}
