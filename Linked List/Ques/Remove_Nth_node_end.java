
//find and remove nth node from end

import org.w3c.dom.Node;

public class Remove_Nth_node_end {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

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

    public int findLength() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }


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

    public void removeNthNodeFromEnd(int n) {
        //len
        int len = findLength();

        //if n points to head
        if(n == len) {
            head = head.next;
            return;
        }


        //1  -> len-n
        Node prev = head;
        Node next;
        int i = 1;
        int idx = len - n;
        while(i < idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        
        Remove_Nth_node_end ll = new Remove_Nth_node_end();

       
        ll.addAtFirst(5); 
        ll.addAtFirst(4); 
        ll.addAtFirst(3);
        ll.addAtFirst(2); 
        ll.addAtFirst(1);
        ll.printList();

        int n = 3;
        ll.removeNthNodeFromEnd(n);
        ll.printList();





    }
}
