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
class SelectionSort {
    
    Scanner s = new Scanner(System.in);
    
    public void selection_sort(){
        Input in = new Input();
        int list[] = in.list_input();

        int n = list.length;
        for (int i = 0; i < n-1; i++)
        {
            System.out.print("\nPass "+i+"->");
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (list[j] < list[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
            for(int k=0; k<n;k++){
                    System.out.print(list[k]+" ");
            }
        }
        System.out.print("\nSorted output--> ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        
    }
    
}
