/*For a given set of Strings. print the Larget string  */


// we use inbuilt function
/*
    (s1.compareTo(s2))


    if 0 : equal
    if <0 : s1 < s2
    if >0 : s1>s2


    // (s1.comapreToIgnorecase(s2)) --> we donot check whether a letter is capital or small

 */ 
import java.util.*;
//lexicographically


public class Largest_string  // O(x * n)
{
    public static void main(String[] args) {
        String s1[] ={"apple", "mango", " banana"};
        
        String largest = s1[0];

        for(int i = 1; i<s1.length; i++) {
            if(largest.compareToIgnoreCase(s1[i])   <  0){
                largest = s1[i];
            }
        }
        System.out.println(largest);
    }
}
