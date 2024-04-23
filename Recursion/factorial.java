import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        if(n>0){
            int fn = fact(n-1);

            return n * fn; 
            
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("Factorial of " + n + " is " + res);
    }
}
