import java.util.*;
/*Check if a number is Odd or Even */
public class odd_even {


    public static void oddorEven(int n){
        int bitMask =1;
        if((n & bitMask )== 0){
          System.out.println("Number "+n+" is even");
        }else{
            System.out.println("Number "+n+ " is odd");
        }
    }
    public static void main(String[] args) {
     oddorEven(2);   
          oddorEven(11);   

    }
}
