/*
Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
 
ropes = {4, 3, 2, 6)
ans : 29

Explanation:
1. Connect the ropes of length 2 and 3 (cost = 2 + 3 = 5). The new list is {4, 5, 6}
2. Connect the ropes of length 4 and 5 (cost = 4 + 5 = 9). The new list is {6, 9}
3. Connect the ropes of length 6 and 9 (cost = 6 + 9 = 15). The new list is {15}
The total cost is 5 + 9 + 15 = 29

*/
import java.util.*;
public class Connect_N_Ropes {
    public static int minCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int rope : ropes) {
            pq.add(rope);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int newRope = first + second;
            cost += newRope;
            pq.add(newRope);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println(minCost(ropes)); // Output: 29
    }
}
