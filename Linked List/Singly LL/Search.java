/*

Search for a key in a Linked List. Return the position where it is found.
If not found. return " -1 ".

*/

import org.w3c.dom.Node;

public class Search {



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

    public int search(int key) {
    Node temp = head;
    int i = 0;

    while (temp != null) {
        if (temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }

    return -1;
    }


    //Recursion
public int recursiveSearch(int key) {
    return recursiveSearchHelper(head, key, 0);
}
private int recursiveSearchHelper(Node current, int key, int index) {
    // Base case: if current is null, key is not found
    if (current == null) {
        return -1;
    }

    // Base case: if key is found
    if (current.data == key) {
        return index;
    }

    // Recursive case: continue searching in the next node
    return recursiveSearchHelper(current.next, key, index + 1);
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


    public static void main(String[] args) {
        Search ll = new Search();

        // calling methods to add Data in LL

        ll.addAtFirst(2); // O(1)
        ll.addAtFirst(1);
        ll.addAtFirst(4);
        ll.addAtFirst(5);
        ll.addAtFirst(6);
        ll.addAtFirst(7);
        ll.addAtFirst(8);
            
        ll.printList();

        // By linear search : 
        int keyToSearch = 5;
        int position = ll.search(keyToSearch);

        if (position != -1) {
            System.out.println("Key " + keyToSearch + " found at position " + position);
        } else {
            System.out.println("Key " + keyToSearch + " not found in the linked list.");
        }

        // By recursive search :
        // int keyToSearch = 8;
        // int position = ll.recursiveSearch(keyToSearch);

        // if (position != -1) {
        //     System.out.println("Key " + keyToSearch + " found at position " + position);
        // } else {
        //     System.out.println("Key " + keyToSearch + " not found in the linked list.");
        // }


    }

    }


