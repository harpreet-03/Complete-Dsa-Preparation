
import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1) return n;

        if(n>1){
            int fb = fib(n-1);
            int fc = fib(n-2);
            int fa = fb + fc;
            return fa;
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println("The fibonacci of " + n + " is " + result);


    }
}
