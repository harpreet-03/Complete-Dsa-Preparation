import java.util.*;
import java.math.*;
// Prime numbers in a specific given range
public class primes_inRange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
        }

    public static void primesinrange(int n){
        for(int i = 2; i<=n; i++){
           if( isPrime(i)){
            System.out.print(i+ " ");

           }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        primesinrange(30);
        
    }

}