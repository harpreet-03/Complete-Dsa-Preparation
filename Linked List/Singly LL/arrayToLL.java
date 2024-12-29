import java.util.*;

class Node{
    int data;
    Node next; 

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class arrayToLL {
    public static Node arrayToLinkedList(int[] arr) {
        int size = arr.length;;
        if(size == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i = 1; i < size; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;

    }

    public static  void printLinkedList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Print the linked list
        printLinkedList(head);
    }

}