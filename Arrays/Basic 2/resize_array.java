

public class resize_array {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static int[] resize(int[]arr, int capacity) {
        int temp[] = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp; //now original arr -> temp (in heap memory ) of size of temp;
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {5,9,3,10};
        System.out.println( "Original array:");
        print(arr);
        System.out.println("Length: " + arr.length);

        System.out.println();
        System.out.println("Resized array: ");
        int[] res  = resize(arr, arr.length*2);

        print(arr);
        System.out.println("Length: " + res.length);

    }
}
