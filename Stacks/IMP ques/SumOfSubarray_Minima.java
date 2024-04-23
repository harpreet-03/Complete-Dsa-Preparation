import java.util.*;

public class SumOfSubarray_Minima {
    public static int sumOfSubarrayMinimum(int arr[]) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];

        // Find previous smaller elements
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            left[i] = (st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }

        st.clear();

        // Find next smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            right[i] = (st.isEmpty() ? n : st.peek());
            st.push(i);
        }

        int mod = (int) 1e9 + 7;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long ps = i - left[i];
            long ns = right[i] - i;

            long totalways = ps * ns;
            long totalsum = arr[i] * totalways;
            sum = (sum + totalsum) % mod;
        }

        return (int) sum;
    }

    public static void main(String[] args) {

        int arr1[] = { 3, 1, 2, 4 }; // Expected output: 17
        int res = sumOfSubarrayMinimum(arr1);
        System.out.println("Sum of Subarray Minimums is: " + res);
    }
}
