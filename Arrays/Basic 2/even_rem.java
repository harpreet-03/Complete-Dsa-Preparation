/*Q. Given an array of integers, return an array with even
integers removed.
Example —
Input: arr = {3, 2, 4, 7, 10, 6, 5}
Output: arr = {3, 7, 5}
 */

public class even_rem {
    public static void print(int [] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] removeEven(int [] arr) {
        int n = arr.length;
        int oddCount = 0;

        for(int i = 0; i < n; i++ ) {
            if(arr[i] % 2 != 0) {
                oddCount ++;
            }
        }

        int res[] = new int[oddCount];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 7, 10, 6, 5} ;
        
        System.out.println("Array of Odd Integers : ");
        int [] result = removeEven(arr);
        print(result);

        
    }
}
