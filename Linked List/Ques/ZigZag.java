import org.w3c.dom.Node;

public class ZigZag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void printList() {
        if (head == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    public Node halfReverseAndMerge() {
        if (head == null || head.next == null) return head;

        // Step 1: Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Step 2: Reverse the second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        // Step 3: Merge the two halves
        Node nextL;
        Node nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

        return head; // Return the new head of the merged list
    }

    public static void main(String[] args) {
        ZigZag zz = new ZigZag();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        zz.printList();
        zz.halfReverseAndMerge();
        zz.printList();
    }
}
