package Java_Dsa.Functions;
import java.util.*;
import java.math.*;

public class Bin_to_dec {

    public static void Bintodec(int binaryNum) {
        int mynum = binaryNum;
        int decimalNum = 0;
        int power = 0;

        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            decimalNum += lastDigit * Math.pow(2, power);
            power++;
            binaryNum /= 10;

        }
        System.out.println("\n   Decimal Number Equivalent to " + mynum + " is " + decimalNum);
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner bin = new Scanner(System.in);
        System.out.print("\n   Enter the Binary Number:  ");
        int binaryNum = bin.nextInt();

        Bintodec(binaryNum);

    }
}