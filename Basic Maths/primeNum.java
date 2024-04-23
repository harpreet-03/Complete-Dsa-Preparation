
import java.util.*;

public class primeNum {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
       
       int i = 3;
       while(i<=Math.sqrt(n)){
           if(n%i == 0){
               return false;
           }
           i+=2;
       }
       return true;
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.printf("%d has %d prime numbers.",num,countPrimes(num));
        
    }
}
