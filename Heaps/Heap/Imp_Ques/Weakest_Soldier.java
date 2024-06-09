/**
We are given an mxn binary matrix of 1's (soldiers) am 0's (civilians). The soldiers are
positioned in front of the civilians. That is, all the 1's will appear to the left of all the O's
in each row.

A row i is weaker than a row j if one of the following is true:
• The number of soldiers in row i is less than the number of soldiers in row j.
• Both rows have the same number of soldiers and i < j.
Find the K weakest rows.

m:4, n=4, k=2
1000
1111
1000
1000

ans = row0 & row2

*/
import java.util.*;
public class Weakest_Soldier {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        int k = 2;
        int[] res = kWeakestRows(mat, k);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[k];
        int[] strength = new int[m];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            strength[i] = count;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (strength[a] == strength[b]) {
                return a - b;
            }
            return strength[a] - strength[b];
        });
        for (int i = 0; i < m; i++) {
            pq.add(i);
        }
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
