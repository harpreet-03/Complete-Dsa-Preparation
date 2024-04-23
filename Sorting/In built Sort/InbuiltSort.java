
import java.util.Arrays;

//   Arrays.sort(arr);
//  O(n logn)
//  Arrays.sort(arr, starting_index, ending_index)

public class InbuiltSort {
   public static void main(String[] args) {
     int arr[] = {5,4,1,3,2};
    Arrays.sort(arr);       //1,2,3,4,5
    // Arrays.sort(arr, 0,3);    //1,4,5,3,2

    System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    
   }
}
