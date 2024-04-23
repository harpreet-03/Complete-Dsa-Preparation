
import java.util.Scanner;

public class sum_of_n {
    public static int calSum(int n){
        
       if(n<0){
        return 0;
       }else{
        return n + calSum(n-1);
       }
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int res = calSum(n);
        System.out.println("Sum of " + n + " is " + res);

    }
}
