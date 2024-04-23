import java.util.*;

public class Kadans {
    public static int Kadan_Algo(int arr[]) {
        int curr_sum = 0, max_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // curr_sum += arr[i];
            // if (curr_sum < 0) {
            //     return curr_sum;
            // }
             curr_sum = Math.max(arr[i], curr_sum+arr[i]);

            max_sum = Math.max(curr_sum, max_sum);
        }
       return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 5,4,-1,7,8};
        int max_sum = Kadan_Algo(arr);
        System.out.println("Max Sum is : " + max_sum);
    }
}