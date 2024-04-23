import java.util.*;

public class p_smaller_n {

    public static int[] prevSmaller(int ps[]) {
        Stack<Integer> st = new Stack<Integer>();
        int n = ps.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && ps[st.peek()] >= ps[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                // here i'm putting indexes rather than values of that index
                ans[i] = st.peek();

                // ps[st.peeek] -> taking values at that index

            }
            st.push(i);
        }
        return ans;

    }

    public static int[] nextSmaller(int ns[]) {
        Stack<Integer> st = new Stack<Integer>();
        int n = ns.length;
        int ans[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && ns[st.peek()] >= ns[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 3,1,2,4};
        

        int p_result[] = prevSmaller(arr);
        int n_result[] = nextSmaller(arr);

        System.out.print("Prev smaller Elements idx: ");
        for (int res : p_result) {
            System.out.print(res + "  ");
        }
        System.out.println();

        System.out.print("Next smaller Elements idx: ");
        for (int res : n_result) {
            System.out.print(res + "  ");
        }
        System.out.println();
    }
}
