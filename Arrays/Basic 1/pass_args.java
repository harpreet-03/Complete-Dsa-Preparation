import java.util.*;
// passing array as argument

public class pass_args {

    public static void update(int arr[]) {
        for (int i = 0; i<arr.length; i++){
            arr[i] = arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        update(arr);
        for (int i = 0; i<arr.length; i++){
           System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    
}
