public class check_for_prime {

    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 65;
        System.out.println(isPrime(n));

    }
}
