import java.util.*;
public class countDigits{

    public static int countDig(int n){
        String num = Integer.toString(n);
        return  num.length();
    }
    public static void main(String[] args) {
        int n = 646434;
        
        int result = countDig(n);
        System.out.println("Number of digits in " + n + ": "+result);
    }
}