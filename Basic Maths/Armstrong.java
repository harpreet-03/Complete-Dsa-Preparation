/*An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth'
power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3
+ I^3 = 371. */

import java.util.Scanner;

public class Armstrong {

    public static int countDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }


    public static boolean isArmstrongNumber(int n){
        int sum=0;
        int length = countDigits(n);
        int original = n;
        while(n!=0){
            int ld = n%10;
            sum += Math.pow(ld, length);
            n/=10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to check whether it is an Armstrong number or not: ");
        int n = sc.nextInt();
        System.out.println("Does n = "+n +"3 is an Armstrong Number: "+"("+ isArmstrongNumber(n)+")");
    }
}
