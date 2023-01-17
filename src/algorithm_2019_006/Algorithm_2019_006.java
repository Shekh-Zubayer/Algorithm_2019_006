/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_006;

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
        Scanner s = new Scanner(System.in);
        System.out.println("================ (Algorithm) ===============");
        System.out.println(""
                + "\t1) Data Structure \n"
                + "\t2) Algorithms");
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
                    + "\t12.Bimary search\n"
                    + "\t13.Euclidean GCD Algorithm\n"
                    + "\t14.Universal hashing\n"
                    + "\t15.Stack\n"
                    + "\t16.Queue\n"
                    + "\t17.Linked List\n"
                    + "\t18.Fibonacci Numbers\n"
                    + "\t19.Recurrence");
            System.out.print("Enter your choice--> ");
            int c1 = s.nextInt(); // to input

            switch (c1) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
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
                default:
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
                    + "\t20.Max flow min cut");
            System.out.print("Enter your choice--> ");
            int c1 = s.nextInt();

            switch (c1) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
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
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Invalid");
        }
    }
    
}
