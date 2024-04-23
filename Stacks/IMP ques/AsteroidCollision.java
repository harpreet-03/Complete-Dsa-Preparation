import java.util.*;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int a : asteroids) {
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int sum = a + st.peek();

                if (sum > 0) {
                    // it means ele on stack is greater than curr ele 'a' so a will be destroyed.
                    a = 0;

                } else if (sum < 0) {
                    // it means ele on stack is smaller than curr ele 'a' so ele on stack will be
                    // destroyed. and we move in left dirction.
                    st.pop();
                    continue;
                } else {
                    // it means both ele are destroyed.
                    st.pop();
                    a = 0;
                }
            }

            if (a != 0) {
                st.push(a);
            }
        }

        int ans[] = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            ans[i] = st.pop();
            i--;
        }

        return ans;

    }

    public static void main(String[] args) {
        int asteroids[] = { 5, 10, -5 };

        int result[] = asteroidCollision(asteroids);

        System.out.print("\nAsteroids that Never Collided: ");
        for(int ele: result) {
            System.out.print("[" + ele + "]" + " ");
        }
        System.out.println();

    }
}
