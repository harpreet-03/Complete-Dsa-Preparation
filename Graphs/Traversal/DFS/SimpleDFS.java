package Dsa_with_Java.Graphs.Traversal.DFS;

import java.util.*;

public class SimpleDFS {
    public static void dfs(List<List<Integer>> adj, int s) {
        Stack<Integer> st = new Stack<>();
        boolean visited[] = new boolean[adj.size()];
    
        st.push(s);
        while (!st.isEmpty()) {
            int curr = st.pop();
    
            if (!visited[curr]) { // Process the node only if it hasn't been visited
                visited[curr] = true;
                System.out.print(curr + " ");
                
                // Push all adjacent unvisited nodes onto the stack
                for (int x : adj.get(curr)) {
                    if (!visited[x]) {
                        st.push(x);
                    }
                }
            }
        }
    }
    

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        System.out.println("DFS traversal starting from vertex 0:");
        dfs(adj, 0);
    }
}
