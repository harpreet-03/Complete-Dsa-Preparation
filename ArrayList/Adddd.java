
import java.util.ArrayList;

public class Adddd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
     
        // Adding elements to the arraylist using add() method
        //  Constant time O(1)
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("ArrayList after adding Elements: " + list);


        // to get Element: 
        //  Constant time O(1)
        int el = list.get(2);
        System.out.println("Element at Index 2: " + el);

        System.out.println("\nSet ele at specific ind: ");
        //set element at index: 
        list.set(2, 100);
        System.out.println(list);


        // contains
        System.out.println(list.contains(100));  //true



        //Delete
        // Time complexity : Best and Average Case - O(1), Worst case - O
        System.out.println(
            "\n\nDeleting an element from the ArrayList: "
        );
        int rm = list.remove(1);
        System.out.println(list);



    }
}
