package Java_Dsa.Functions;
import java.util.*;

// WAF to calculate Binomial Coefficient of a given number: 
//formula:  C(n,r) = n! / (r! * (n-r)!)


public class binomial_coeff {

    // function for factorial

    public static int fact(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }

    }

    // function for binomial coefficient
    public static int binomial(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r) ;

        int binomial_coef = n_fact / (r_fact * nmr_fact) ;
        return binomial_coef;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();

        // int n = 5;
        // int r = 2;
        System.out.println("Binomial Coefficient is "+ binomial(n, r));
        //output: C(5,2) = 10;
    }
}
