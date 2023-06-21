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
public class Input {

    Scanner s = new Scanner(System.in);

    public int[] list_input() {
        System.out.print("Enter the number of input you want--> ");
        int n = s.nextInt();
        System.out.print("Enter the numbers--> ");
        int list[] = new int[n];
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print("index{" + i + "}= ");
            list[i] = s.nextInt();
        }
        return list;
    }
    public int keyInput() {
        System.out.print("Enter key value:> ");
        return s.nextInt();

    }
    public int valueInput( String msg) {
        System.out.print(msg);
        return s.nextInt();

    }
}
