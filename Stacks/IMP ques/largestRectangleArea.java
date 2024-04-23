import java.util.*;

public class largestRectangleArea {

    public int maxRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ps = prevSmaller(heights);
        int[] ns = nextSmaller(heights);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = ns[i] - ps[i] - 1;
            int currArea = heights[i] * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    public static int[] nextSmaller(int heights[]) {
        int n = heights.length;
        int ns[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                ns[st.pop()] = i;
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            ns[st.pop()] = n;
        }

        return ns;
    }

    public static int[] prevSmaller(int heights[]) {
        int n = heights.length;
        int ps[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                ps[st.pop()] = i;
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            ps[st.pop()] = -1;
        }

        return ps;
    }


    public static void main(String[] args) {
        largestRectangleArea lra = new largestRectangleArea();
        int[] heights = {2, 1, 5, 6, 2, 3};
        int maxArea = lra.maxRectangleArea(heights);
        System.out.println("Max Rectangle Area: " + maxArea);
    }
}
