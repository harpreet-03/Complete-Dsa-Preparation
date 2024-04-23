// rear = (rear + 1) % size


public class CircularQueue_Arrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1; 
            front = -1;           
        }

        public static boolean isEmpty() { 
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }


        // add - O(1)
        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        public static int remove() {  //O(n) - bcz we have moved each element by 1 index
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            
            int result = arr[front];
           
            if(rear == front) {
                rear = -1;
                front = -1;
            }else{
                front = (front + 1) % size;
            }
            return result;
        }


        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
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
