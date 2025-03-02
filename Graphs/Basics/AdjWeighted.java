package Dsa_with_Java.Graphs.Basics;

import java.util.*;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class AdjWeighted {
    public static void main(String[] args) {
        // Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();

            // Add the edge to the adjacency list for both u and v (since the graph is
            // undirected)
            adj.get(u).add(new Pair(v, weight));
            adj.get(v).add(new Pair(u, weight));
        }

        sc.close();

        System.out.println("\nWeighted Adjacency List:\n");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.first + ", " + p.second + ") ");
            }
            System.out.println();
        }
    }
}
