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
class InsertionSort {
    
    Scanner s = new Scanner(System.in);
    
    public void insertion_sort(){
        Input in = new Input();
        int list[] = in.list_input();

        int n = list.length;
        for (int i = 1; i < n; ++i) {
            System.out.println("\nPass "+i+"->");
            int key = list[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
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
