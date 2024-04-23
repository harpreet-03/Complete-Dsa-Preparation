import java.util.Collections;
import java.util.Arrays;


/*
 * import java.util.Collections;
 * Arrays.sort(arr, Collections.reverseOrder());
 * 
 * 
 * Arrays.sort(arr, si, ei, Collections.reverseOrder());
 * 
 */

public class collections {
    

    public static void main(String[] args) {
        Integer arr[] = {54,1,3,55,2};

        Arrays.sort(arr, Collections.reverseOrder());    //55 54 3 2 1

        // Arrays.sort(arr,1,3, Collections.reverseOrder());    //54 3 1 55 2



        System.out.print("Sorted Array : ");
        for( Integer i: arr){
            System.out.print( i + " ");
        }
    }
}
