/*Given a route containing 4 directions (E, W, N, S),
find the shortest path to reach destination.
 */

public class shortestPath {

    public static float getPath(String path)   //O(n)
    {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }

        int x2 = x * x;.
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getPath(path));

    }
}
// output: 5.0