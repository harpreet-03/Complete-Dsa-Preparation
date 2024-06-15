import java.util.*;

/*
 Brute force approach will be :

1. using nested loop;
2. for each element in the array, check if it is already present in the array or not;
3. if not same, then put it in new array and check again.
4. return the length of the new array.

T.C --> O(n^2)

Optimized approach will be :
1. using HashSet ;
2. for each element in the array, check if it is already present in the HashSet or not;
3. if not same, then put it in HashSet and check again.
4. return the size of the HashSet.

 */

public class Count_Distinct_Elements {
    public static int countDistinct(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        System.out.println(countDistinct(arr));
    }
}
