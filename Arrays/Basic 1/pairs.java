/**
 * The "pairs" class in Java prints all possible pairs of elements in an array and calculates the total
 * number of pairs.
 * trick to find total numbers of pairs = n(n-1)/2
 */
import java.util.*;

public class pairs {

    public static void pairss( int a[]) {
        int tp = 0;
        for(int i = 0; i< a.length; i++){
            int current = a[i];
            for(int j = i +1; j<a.length; j++){
                System.out.print("("+ current + " , " + a[j] + ") " );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs "+ tp);
    }
    public static void main(String[] args) {
        int a[] ={2,4,6,8,10};
        pairss(a);
    }   
}
