
import java.util.*;

public class multip {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println(sum);
    }
    
}

