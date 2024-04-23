

public class UsingArrays{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;            
        }

        public static boolean isEmpty() { 
            return rear == -1;
        }


        // add - O(1)
        public static void add(int data) {
            if(rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data; 
        }

        //remove
        public static int remove() {  //O(n) - bcz we have moved each element by 1 index
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }


        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        
    }
    public static void main(String[] args) {
        Queue q =  new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}