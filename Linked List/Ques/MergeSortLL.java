import org.w3c.dom.Node;

public class MergeSortLL {
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

    //add at first
    public void addAtFirst(int data) {

        // step1 - create new node

        Node newnNode = new Node(data);

        // if LL is empty!
        if (head == null) {
            head = tail = newnNode;
            return;
        }

        // Step2 - Make the new node point to existing node (head/tail)

        newnNode.next = head;

        // Step3 - Set the head to new node

        head = newnNode;
    }


    // find middle node for Merge Sort
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    // merge(left and right)
    private Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        //base case:
        if(head == null || head.next == null) return head;

        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.addAtFirst(5);
        //5->4->3->2->1

        ll.printList();
        ll.head = ll.mergeSort(ll.head);
        ll.printList();

    }
}
