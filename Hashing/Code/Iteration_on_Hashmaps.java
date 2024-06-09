import java.util.*;

public class Iteration_on_Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia",6);
        hm.put("Brazil", 21);

        // Iterate
        // or entrySet
        Set<String> keys = hm.keySet(); //<Key type>
        System.out.println(keys);

        for (String k : keys) {
            
            System.out.println("Key = "+ k + ",value = "+ hm.get(k));
        }
        /*output :
        Key = USA,value = 50
        Key = China,value = 150
        Key = Brazil,value = 21
        Key = India,value = 100
        Key = Indonesia,value = 6
         */

    }
}
