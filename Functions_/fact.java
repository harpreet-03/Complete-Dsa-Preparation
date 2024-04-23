import java.util.*;

public class fact {

    public static int fact(int a) {
        //method 1;
        // if (a == 1) {
        //     return 1;
        // } else {
        //     return (a * fact(a - 1));
        // }


        // method 2;
        // return (a == 1 || a == 0) ? 1 : a * fact(a - 1);



        //method 3;
        int f=1;
        for (int i=1; i<=a; i++){
            f=f*i;
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The Factorial of " + n + " is: " + fact(n));

        // or another method

        // System.out.println(fact(n));

        // or

        // int factorial = fact(n);
        // System.out.println(factorial);

    }
}
