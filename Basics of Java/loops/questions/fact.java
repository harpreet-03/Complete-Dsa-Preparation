import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any Positive Integer: ");
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *=i;

        }
        System.out.println("The Factorial of " + n +" is "+ fact );
       
        
    }
}
