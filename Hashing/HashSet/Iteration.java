/*
 * Iteration in HashSets:
   ----------------------
  
 * a. using Iterator:
  ----------------------
eg--> 
Iterator it = set.iterator()
    while(it.hasNext()){
       print(it.next);
}

 
 * b. Using enhanced loop:
 --------------------------
 eg--> for(int)




 */

 import java.util.*;
 public class Iteration{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Banglore");
        cities.add("Batala");
        
        // Using Iterator:
        System.out.print(" Using Iterator(): ");
        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.print("["+it.next() + "] ");
        }
        System.out.println();

        // output:  [Delhi] [Banglore] [Mumbai] [Batala] (unordered)



        // Using Enhanced loop:
        System.out.print(" Using for-each Loop: ");
        for(String c : cities){
            System.out.print("["+c + "] ");
        }
    }
 }