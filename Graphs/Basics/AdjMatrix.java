package Dsa_with_Java.Graphs.Basics;


import java.util.Scanner;

public class AdjMatrix{

    public static void main(String[] args) {
        // Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // adjacency matrix for undirected graph
        int[][] adj = new int[n + 1][n + 1];
        
        // Add the edges to the matrix
        for (int i = 0; i < m; i++) {
            // Taking the input
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            // Adding the edges
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        sc.close();

        System.out.println("\nAdjacency Matrix:\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}