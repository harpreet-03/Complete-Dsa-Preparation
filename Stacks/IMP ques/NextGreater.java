import java.util.*;

/*NOTE: 
 * NExt greater to the right:  so we've started loop from right;
if we want left greater number, so we'll just just loop form left.
 */


public class NextGreater {

    
    public static void main(String[] args) {

        // O(N)

        int arr[] = { 6, 8, 0, 1, 3 };
        int n = arr.length;
        Stack<Integer> st = new Stack<Integer>();
        int nge[]  = new int[n];


        for(int i = n-1; i>=0; i--) {

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = arr[st.peek()];

            st.push(i);
        }

        //printing Next greater element array: 
        for(int i: nge) {
            System.out.print(i+ " ");
        }

    }
}
