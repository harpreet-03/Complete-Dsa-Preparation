import java.util.*;
public class code {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(60);
        ts.add(70);
        ts.add(80);
        ts.add(90);
        ts.add(100);
        System.out.println(ts);
        System.out.println(ts.ceiling(45));
        System.out.println(ts.floor(45));
        System.out.println(ts.higher(45));
        System.out.println(ts.lower(45));
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts);
    }
}
