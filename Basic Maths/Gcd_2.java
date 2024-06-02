import java.util.Scanner;

//GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them.


public class Gcd_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int smaller = Math.min(num1, num2);
        int gcd = 1;
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
        sc.close();
    }
}
