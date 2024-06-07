package Java_Dsa.Functions;
import java.util.*;

public class param_func {

    public static void summ(int num1, int num2) {

        int sum = num1+num2;

        System.out.println("Sum is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a= sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        summ(a, b);

    }
}
