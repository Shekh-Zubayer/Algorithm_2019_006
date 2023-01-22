package algorithm_2019_006;

import java.util.Scanner;

public class BubbleSort {

    Scanner s = new Scanner(System.in);

    public void bubble_sort() {
        Input in = new Input();
        int list[] = in.list_input();

        int n = list.length;
        for (int i = 0; i < n; i++) {
            System.out.println("\nPass "+i+"->");
            for(int j = 0; j<n-i-1;j++){
                if (list[j]>list[j+1]){
                    int temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
                for(int k=0; k<n;k++){
                    System.out.print(list[k]+" ");
                }
                System.out.println("");
            }

        }

        System.out.print("Sorted output--> ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
