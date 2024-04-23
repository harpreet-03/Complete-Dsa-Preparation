
/*

Activity Selection is a problem where you have a set of activities, each with a start time and a finish time. The goal is to select the maximum number of activities that don't overlap, meaning their time intervals don't intersect.
 
*/
import java.util.*;

public class Activity_Selection {
    public static void main(String[] args) { // O(n)

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;

        // Given: end time basis sorted

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // 1st activity
        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum number of activities that can be done are: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

    }
}