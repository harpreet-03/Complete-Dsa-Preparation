package Cond_stat_java;
import java.util.*;

public class basic_IF_Else {
    public static void main(String[] args) {

        //take input from user and print whether he 
        // is greater than eighteen or not

        Scanner sc = new Scanner(System.in);
        int user_age = sc.nextInt();
        if (user_age >= 18) {
            System.out.println("Yes You're above 18");

        } else {
            System.out.println("No! You are not above 18");
        }

        // calculate whether the number is odd or even:
        
        
        System.out.print("Enter the Number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("The Input Number is an Even Number");
        } else {
            System.out.println("The Input Number is an Odd NUmber");
        }


        // check whether a==b or a>b or a<b using if , else if, else:

        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();

        if (a==b){
            System.out.println("a is equal to b");
        }
        else if (a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is smaller than b");
        }

    }
}
