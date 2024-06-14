import java.util.*;

public class code {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("Australia");
        lhs.add("South Africa");
        lhs.add("India");
        lhs.add("Australia");
        lhs.add("India");

        System.out.println(lhs); // [India, Australia, South Africa]
    }
}

