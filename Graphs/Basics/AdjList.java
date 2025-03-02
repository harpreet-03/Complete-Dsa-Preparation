package Dsa_with_Java.Graphs.Basics;
import java.util.*;

public class AdjList {
    public static void main(String[] args) {
        // Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // adjacency list for undirected graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n + 1);
        
        // Initialize the adjacency list
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add the edges to the list
        for (int i = 0; i < m; i++) {
            // Taking the input
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            // Adding the edges
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        sc.close();

        System.out.println("\nAdjacency List:\n");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

    }
}
