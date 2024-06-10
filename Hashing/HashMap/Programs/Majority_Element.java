/*
 Ques :

 Given an integer array of size n, find all elements that appear more than [ n/3 ] times.

nums[] = [1, 3, 2, 5, 1, 3, 1, 5, 1];
Output: [1]

nums[] = [1, 2]
Output: [1, 2]
*/

import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // or Instead of whole if-else, we can add this line below in the comment.
        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


       
        for (int key :  map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.print(key + " ");
            }
        }


    }
}
