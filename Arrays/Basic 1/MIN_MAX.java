import java.util.*;
import java.util.Arrays;

public class MIN_MAX {

    public static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int num[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 6, 5 ,-1,8,9,88};

        int largest_num = getlargest(num);
        System.out.println("Largest num is: " + largest_num);

        int smallest_num = getSmallest(num);
        System.out.println("Smallest num is: " + smallest_num);
    }
}
