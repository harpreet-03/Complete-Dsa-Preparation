

import java.util.*;

public class trappingRainwater {

    public static int trappedRainwater(int height[]) //O(n)
    {

        int n = height.length;

        // calculate left mex boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }

        // calculate right max boundary - array

        int rigthMax[] = new int[n];
        rigthMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rigthMax[i] = Math.max(height[i], rigthMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftMax bound, rigthMax bound)

            int waterlevel = Math.min(leftMax[i], rigthMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print("The maximum amount of rain water that can be stored is : ");
        System.out.println(trappedRainwater(height));

    }
}
