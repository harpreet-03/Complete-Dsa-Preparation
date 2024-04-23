import org.w3c.dom.Node;

public class LL_Doubly {
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // print List

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add node
    /*
     * create node
     * newNode.next = head;
     * head.prev = newNode
     * head = newNode
     */

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // remove first
    /*
     * head = head.next
     * head.prev = null
     * size++;
     */

    public int removeFirst() {
        if (head == null) {
            System.out.println("Doubly L.L is empty!");
            return Integer.MIN_VALUE;
        }

        // if single node is present
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    //remove last node - tail
    public Node deleteLastNode(Node head) {
        if (head.next == null) {
            return null;
        }

        Node curr = head;

        // Traversing to the last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // Updating the linked list
        Node temp = curr;
        curr = curr.prev;
        curr.next = null;

        return head;
    }


    //REVERSE - D L.L
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LL_Doubly dl = new LL_Doubly();

        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);

        dl.print();
        System.out.println("Size: " + dl.size);

        // dl.removeFirst();
        // dl.print();
        // System.out.println("Size: " + dl.size);

        dl.reverse();
        dl.print();

        //deleting tail;
        dl.deleteLastNode(head);
        dl.print();

    }
}
