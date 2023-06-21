/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_006;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author 21 Technology
 */
public class Algorithm_2019_006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {

            Scanner s = new Scanner(System.in);
            System.out.println("\n================ (Algorithm) ===============");
            System.out.println(""
                    + "\t1.Data Structure\n"
                    + "\t2.Algorithms\n"
                    + "\t3.Exit");
            System.out.print("Enter your choice:> ");
            int choice = s.nextInt();
            System.out.println("============================================");

            if (choice == 1) {
                System.out.println("================ (Data Structure) ===============");
                System.out.println(""
                        + "\t01.Bubble sort\n"
                        + "\t02.Insertion sort\n"
                        + "\t03.Selection sort\n"
                        + "\t04.Marge sort\n"
                        + "\t05.Quick sort\n"
                        + "\t06.Counting sort\n"
                        + "\t07.Radix sort\n"
                        + "\t08.Heap sort\n"
                        + "\t09.Bin sort\n"
                        + "\t10.Shell sort\n"
                        + "\t11.Linear search\n"
                        + "\t12.Binary search\n"
                        + "\t13.Euclidean GCD Algorithm\n"
                        + "\t14.Universal hashing\n"
                        + "\t15.Stack\n"
                        + "\t16.Queue\n"
                        + "\t17.Linked List\n"
                        + "\t18.Fibonacci Numbers\n"
                        + "\t19.Recurrence\n"
                        + "\t20.Exit");
                System.out.print("Enter your choice--> ");
                int c1 = s.nextInt(); // to input

                switch (c1) {
                    case 1:
                        BubbleSort b = new BubbleSort();
                        b.bubble_sort();
                        break;
                    case 2:
                        InsertionSort is = new InsertionSort();
                        is.insertion_sort();
                        break;
                    case 3:
                        SelectionSort ss = new SelectionSort();
                        ss.selection_sort();
                        break;
                    case 4:
                        MergeSort ms = new MergeSort ();
                        ms.mergeSort();
                        break;
                    case 5:
                        QuickSort qs = new QuickSort();
                        qs.quickSort();
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        HeapSort hs = new HeapSort ();
                        hs.heapSort();
                        break;
                    case 9:
                        BinSort bin = new BinSort ();
                        bin.binSort();
                        break;
                    case 10:
                        ShellSort sss = new ShellSort();
                        sss.run();
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    case 20:
                        exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;

                }
            } else if (choice == 2) {
                System.out.println("================ (Algorithm) ===============");
                System.out.println(""
                        + "\t01.Largest common subsequence \n "
                        + "\t02.Optimal Binary Search Tree \n "
                        + "\t03.Matrix chain multiplication \n "
                        + "\t04.Strassens's matrix multiplication \n "
                        + "\t05.BFS \n "
                        + "\t06.DFS \n "
                        + "\t07.DAG \n "
                        + "\t08.Longest increasing subsequence \n "
                        + "\t09.Topological sort \n "
                        + "\t10.Krushkal's algorithm \n "
                        + "\t11.Prim's algorithm \n "
                        + "\t12.Dijkastra's algorithm \n "
                        + "\t13.Bellman ford's algorithm \n "
                        + "\t14.Warshall's algorithm \n "
                        + "\t15.(0,1) KKnapsack problem \n "
                        + "\t16.Naive string matching algorithm \n "
                        + "\t17.Rabin krap string matching algorithm \n "
                        + "\t18.Activity selection problem \n "
                        + "\t19.Recurrence \n "
                        + "\t20.Max flow min cut\n"
                        + "\t21.Exit");
                System.out.print("Enter your choice--> ");
                int c1 = s.nextInt();

                switch (c1) {
                    case 1:
                        LCS lcs = new LCS();
                        lcs.run();
                        break;
                    case 2:
                        OBST obst = new OBST();
                        obst.run();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        Bfs bfs = new Bfs();
                        bfs.b_f_s();
                        break;
                    case 6:
                        Dfs dfs = new Dfs();
                        dfs.d_f_s();
                        break;
                    case 7:
                        break;
                    case 8:
                        LIS lis = new LIS();
                        lis.run();
                        break;
                    case 9:
                        TopologicalSort ts = new TopologicalSort();
                        ts.topological_sort();
                        break;
                    case 10:
                        Krushkal krushkal = new Krushkal();
                        krushkal.run();
                        break;
                    case 11:
                        Prims prims = new Prims();
                        prims.run();
                        break;
                    case 12:
                        Dijkstra dijkstra = new Dijkstra(5);
                        dijkstra.run();
                        break;
                    case 13:
                        BellmanFord bf = new BellmanFord();
                        bf.run();
                        break;
                    case 14:
                        int INF = 99999;
                        Warshall warshall = new Warshall();
                        int graph[][] = {{0, 5, INF, 10},
                        {INF, 0, 3, INF},
                        {INF, INF, 0, 1},
                        {INF, INF, INF, 0}};
                        warshall.run(graph);
                        break;
                    case 15:
                        KnapSack ks = new KnapSack();
                        ks.runKnapSack();
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    case 20:
                        break;
                    case 21:
                        exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                }

            } else if (choice == 3) {
                exit(0);
            } else {
                System.out.println("Invalid Input");
            }
        }

    }
}
