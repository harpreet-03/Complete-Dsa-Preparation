import java.util.*;

public class sum_for{
    public static void main(String[] args) {
        // Print the sum of first n natural numbers::
        // given : n=4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum is : "+ sum);
    // input:4
    // output: 10
    
    }

}
