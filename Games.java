/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package games;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tab1 = new int[n]; // 1 2 3 
        int[] tab2 = new int[n]; // 2 4 4
        int count = 0;
        for (int i = 0; i < n; i++) {
            tab1[i] = sc.nextInt();
            tab2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tab1[i] == tab2[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
