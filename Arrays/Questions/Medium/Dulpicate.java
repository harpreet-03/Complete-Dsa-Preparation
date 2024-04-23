
import java.util.*;
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
 */
import java.util.Arrays;

public class Dulpicate{
    public static boolean containsDuplicate(int arr[]) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        boolean hasDuplicate = containsDuplicate(arr);
        System.out.println("Duplicate: " + hasDuplicate);
    }
}
