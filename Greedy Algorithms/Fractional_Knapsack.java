import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int cap = 50;

        double ratio[][] = new double[val.length][2];
        // 0th column = idx, 1st col == ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / wt[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int ans = 0;
            for(int i = ratio.length-1; i >= 0; i--) {
                int idx = (int) ratio[i][0];
                if(wt[idx] <= cap) {
                    cap -= wt[idx];
                    ans += val[idx];
                } else {
                    ans += (cap * ratio[i][1]);
                    
                    break;
                }
            }
        System.out.println(ans);

        
    }
}
