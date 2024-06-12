

import java.util.HashSet;

public class code {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);
        
        System.out.println(set); //[50, 20, 40, 10, 30]

        if(set.contains(20)){
            System.out.println("20 is present in the set");
        }else{
            System.out.println("20 is not present in the set");
        }

        set.remove(20);
        System.out.println(set); //[50, 40, 10, 30]

        
    }
}
