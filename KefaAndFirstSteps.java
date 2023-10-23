/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kefaandfirststeps;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class KefaAndFirstSteps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[]tab = new long[n];
        int count=1,max=1;
        
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextLong();
        }
        for (int i = 0; i < n-1; i++) {
            if (tab[i] <= tab[i+1]) {
                count++;
                max = Math.max(max, count);
            }else{
                count=1;
            }
        }
         System.out.println(max);
    }
    
}
