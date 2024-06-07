package Java_Dsa.Functions;
import java.math.* ;
import java.util.*;


public class Dec_to_bin {
    public static void Dectobin(int decNum) {
        int mynum = decNum;
        int power = 0;
        int binaryNum = 0;

        while(decNum > 0) {
            int rem = decNum % 2;
            binaryNum += rem * Math.pow(10,power);
            power++;
            decNum /= 2;
        }
        System.out.println("Binary form  of "+ mynum + " is " + binaryNum);
    }
    public static void main(String[] args) {
        Scanner dec = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decNum = dec.nextInt();

        Dectobin(decNum);
    }
}
