import java.util.Scanner;

public class prime {

    public static boolean isPrime(int n) {
        // check if n is a multiple of 2
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0 || n == 1) {
            return false;
        }
        // check odd numbers up to the square root of n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        System.out.println(n + " is " + (isPrime ? "prime" : "non-prime"));
        
    }
}
