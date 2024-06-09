import java.util.HashMap;

public class Creating_HashMap {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        // print
        System.out.println(hm); // {USA=50, China=150, India=100}
        // HashMap are un-ordered map. That's why output order is not same as the order
        // of insertion.

        // get - O(1)
        int population = hm.get("India");
        System.out.println(population); // 100

        // if there is no key, it returns null
        System.out.println(hm.get("Nepal")); // null

        // containsKey - O(1)
        System.out.println(hm.containsKey("India")); // true

        // remove - O(1)
        hm.remove("China");
        System.out.println(hm); // {USA=50, China=150}

        // update - O(1)
        hm.put("India", 200);
        System.out.println(hm); // {USA=50, China=200}

        // size
        System.out.println(hm.size()); // 2

        // isEmpty
        System.out.println(hm.isEmpty()); // false

        // clear
        hm.clear(); //--> It clears all the HashMap

    }
}
