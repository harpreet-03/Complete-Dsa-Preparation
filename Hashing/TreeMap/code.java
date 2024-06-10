package Java_Dsa.Hashing.TreeMap;
import java.util.*;

public class code {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India ", 135);
        tm.put("China", 200);
        tm.put("USA", 40);
        tm.put("UK", 20);
        tm.put("UAE", 10);
        tm.put("Pakistan", 30);
        tm.put("Australia" , 99);

        System.out.println(tm);
    }
}
