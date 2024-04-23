import java.util.*;
public class trappedWater {

    public static int trap(int[] h) {
        int left = 0, right = h.length - 1, lm = 0, rm = 0, trappedWater = 0;

        while (left < right) {
            if (h[left] < h[right]) {
                lm = Math.max(lm, h[left]);
                trappedWater += lm - h[left];
                left++;
            } else {
                rm = Math.max(rm, h[right]);
                trappedWater += rm - h[right];
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int h[] = { 4,2,0,6,3,2,5};
        System.out.println("The trapped water level is: " + trap(h)); // Output: 11
    }
}
