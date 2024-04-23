import org.w3c.dom.Node;

public class linkedList_basic {

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


    // Add() -> at first
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


    // Add() -> at last
    public void addAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    // Add at Middle
    public void AddMiddle(int data, int idx) {

        if(idx == 0) {
            addAtFirst(data);
            return;
        }


        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            // if the list is empty, make the new node both the head and the tail
            head = tail = newNode;
            return;
        }

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // when i = idx-1 or temp = prev;
        newNode.next = temp.next;
        temp.next = newNode;
    }
 
// Method to find the length of the linked list
    public int findLength() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    //Remove From 1st Index
    public int remove() {  

        int len = findLength();

        if( len == 0) {
            System.out.println("L.L is empty!");
            return Integer.MIN_VALUE; 
        }else if(len == 1){
        
        int val = head.data;
        head = tail = null;
        return val;

        }

        int val = head.data;
        head = head.next;
        return val;
    }

    
   // Remove the element from the last index
    public int removeLast() {

        int len = findLength();

        // Check if the linked list is empty
        if (len == 0) {
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE; // Return a sentinel value to indicate an error or empty list
        } else if (len == 1) {
            // If there is only one element in the linked list

            int removedValue = head.data;
            head = tail = null; // Set both head and tail to null, indicating an empty list
            return removedValue; // Return the value of the removed element
        }

        Node prev = head;

        // Traverse the list until the second-to-last node
        for (int i = 0; i < len - 2; i++) {
            prev = prev.next;
        }

        int removedValue = prev.next.data; // Store the value of the last element
        prev.next = null; // Set the next of the second-to-last node to null, effectively removing the last element
        tail = prev; // Update the tail to point to the new last node

        return removedValue; // Return the value of the removed element
    }

    //revrse the list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Printing the linkedlist
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

        linkedList_basic ll = new linkedList_basic();

        // calling methods to add Data in LL

        ll.addAtFirst(2); // O(1)

        ll.addAtFirst(1);

        ll.addAtLast(3);

        ll.addAtLast(4); // O(1)

        ll.AddMiddle(9, 2); // just give specific index, adn it'll add the data on that index : 

        ll.printList();

        int length = ll.findLength();
        System.out.println("Length of the linked list: " + length);

        System.out.println("The Original L.L");
        ll.printList();

        // int removedValue = ll.remove(); // Call the remove method
        // System.out.println("Removed value from the first index: " + removedValue);
    
        // ll.printList();

        // int removedLastValue = ll.removeLast(); // Call the remove method
        // System.out.println("Removed value from the Last index: " + removedLastValue);
        // ll.printList();






        // reverse the list
        System.out.println("The Reversed the L.L");
        ll.reverse();
        ll.printList();






        // After printing the whole list, time complexity is O(N)

    }
}
