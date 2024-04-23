

public class reverse {

    public static void print(int []arr) {
        for(int i: arr) {
            System.out.print(i +" ");

        }
        System.out.println();
    }

    public static void reverse1(int[] arr, int start, int end) {
        // Write your code here
        

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       
    }

    public static void reverse2(int[] arr) {
        int rev[] = new int[arr.length];
        int j = arr.length-1 ;
        for(int i = 0; i<arr.length; i++ ){
            rev[j] = arr[i];
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 10, 7, 8};
        
        System.out.println("Using 1st function: ");
        reverse1(arr, 0, arr.length-1);
        print(arr);

        System.out.println("Using 2nd function: ");
        reverse2(arr);
        print(arr);
       

    }
}
