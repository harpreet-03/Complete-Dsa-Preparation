import java.util.LinkedList;

public class LL_in_JCF {
    public static void main(String[] args) {
        
        //we can only use class types like Integer, FLoat, Character
        //we can't use objects: int, float, boolean(primitive datatypes)

        // create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2

        //Printing L.L
        System.out.println("Linked List Contents : " + ll);


        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println("Linked List Contents : " + ll);
    }
}
