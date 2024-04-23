import java.util.*;

public class palindrome {

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Number : " + number+ " is a Palindrome ");
        } else {
            System.out.println("Number : " + number + " is not a Palindrome ");
        }
    }

}
//  another method
/*
 * import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }

        return x == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        boolean result = isPalindrome(x);
        System.out.println("Is Palindrome: " + result);


    }
}
 */