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
class TopologicalSort {
    Scanner s = new Scanner(System.in);
    public void topological_sort() {
        System.out.print("\nEnter the node count-->");
        int a = s.nextInt();
        System.out.print("\nEnter number of edges-->");
        int c = s.nextInt();
        Grapht g = new Grapht(a);
        for (int i=0;i<c;i++){
            System.out.print("\nEnter edges-->");
            g.addEdge(s.nextInt(), s.nextInt());
        }
        
        System.out.print("\nFollowing is Topological Traversal-->");
        g.topologicalSort();

    }
}

class Grapht {
    // No. of vertices
    private int V;
 
    // Adjacency List as ArrayList of ArrayList's
    private ArrayList<ArrayList<Integer> > adj;
 
    // Constructor
    Grapht(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }
 
    // Function to add an edge into the graph
    void addEdge(int v, int w) { adj.get(v).add(w); }
 
    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices adjacent
        // to thisvertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
 
        // Push current vertex to stack
        // which stores result
        stack.push(new Integer(v));
    }
 
    // The function to do Topological Sort.
    // It uses recursive topologicalSortUtil()
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Call the recursive helper
        // function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
 
        // Print contents of stack
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }
}
