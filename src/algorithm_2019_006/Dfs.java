/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_006;

import java.util.*;

/**
 *
 * @author 21 Technology
 */
class Dfs {

    Scanner s = new Scanner(System.in);

    public void d_f_s() {
        System.out.print("\nEnter the node count-->");
        int a = s.nextInt();
        System.out.print("\nEnter number of edges-->");
        int c = s.nextInt();
        Graphd g = new Graphd(a);
        for (int i = 0; i < c; i++) {
            System.out.print("\nEnter edges-->");
            g.addEdge(s.nextInt(), s.nextInt());
        }
        System.out.print("\nEnter the starting node for travarsal-->");
        int b = s.nextInt();
        System.out.print("\nFollowing is Depthth First Traversal-->");
        g.DFS(b);

    }

}

class Graphd {

    private int V;

    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    @SuppressWarnings("unchecked")
    Graphd(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        // Add w to v's list.
        adj[v].add(w);
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // The function to do DFS traversal.
    // It uses recursive DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }
}
