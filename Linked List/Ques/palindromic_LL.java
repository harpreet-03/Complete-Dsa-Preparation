
public class palindromic_LL {
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


    // find middle of the L.L
    // Slow-Fast approach

    public Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public boolean checkPalindrome() {
        if(head == null || head.next == null) return true;

        //step 1 : mid
        Node mid = middle(head);

        //step 2 : reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;


        //step 3 : checking (l == r)

        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;


    }

    public static void main(String[] args) {
        palindromic_LL linkedList = new palindromic_LL(); // Create an instance of the class
        linkedList.addAtFirst(1);
        linkedList.addAtFirst(2);
        linkedList.addAtFirst(2);
        linkedList.addAtFirst(1);
    
        linkedList.printList(); // Call the printList method on the instance
        
        System.out.println("Is Palindrome: " + linkedList.checkPalindrome());

    }
    
    

}
