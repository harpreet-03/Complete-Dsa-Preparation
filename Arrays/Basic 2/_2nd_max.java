
/*Q. Given an array ot integers, return second maximum value.
The second maximum value exists.
Example —
Input: arr = {12, 34, 2, 34, 33, 1}
Output: 33

*/
import java.util.*;

public class _2nd_max {
    public static int second_maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    /*
     * For each element arr[i]:
     * 
     * If arr[i] is less than the current maximum (max), update secondMax to be
     * equal to max and update max to be equal to arr[i]. This ensures secondMax
     * always stores the previous maximum value.
     * 
     * If arr[i] is greater than secondMax and not equal to max, update secondMax to
     * be equal to arr[i]. This ensures that secondMax stores the second largest
     * value in the array.
     * 
     */

    /*
     * The reason for updating secondMax to max before updating max to arr[i] is to
     * ensure that the previous maximum value is stored in secondMax before updating
     * max with a potentially smaller value. This ensures that secondMax always
     * contains the second largest value encountered so far.
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 12, 34, 2, 34, 33, 1 };
        System.out.println("Second Maximum Value is " + second_maximum(arr));
    }
}
