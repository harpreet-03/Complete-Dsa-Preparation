import java.util.*;

public class largest {
    public static int getlargest(int arr[]) {
        int largest =Integer.MIN_VALUE;   //  -infinity
        int smallest = Integer.MAX_VALUE;  // +infinity

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }

            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is :"+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6,3,5};
        System.out.println("largest value is :"+ getlargest(arr));

    }
}
