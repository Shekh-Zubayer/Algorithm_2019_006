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
class Bfs {

    Scanner s = new Scanner(System.in);

    public void b_f_s() {
        System.out.print("\nEnter the node count-->");
        int a = s.nextInt();
        System.out.print("\nEnter number of edges-->");
        int c = s.nextInt();
        Graph g = new Graph(a);
        for (int i=0;i<c;i++){
            System.out.print("\nEnter edges-->");
            g.addEdge(s.nextInt(), s.nextInt());
        }
        System.out.print("\nEnter the starting node for travarsal-->");
        int b = s.nextInt();
        System.out.print("\nFollowing is Breadth First Traversal-->");
        g.BFS(b);

    }

}

class Graph {

    // No. of vertices
    private int V;

    // Adjacency Lists
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue
                = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {

            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued
            // vertex s.
            // If an adjacent has not been visited,
            // then mark it visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
