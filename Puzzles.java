/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puzzles;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Puzzles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tab [] = new int[m];
        int temp [] = new int[n];
        int result=1000;
        for (int i = 0; i < m; i++) {
            tab[i] = sc.nextInt();
        }
        Arrays.sort(tab);
//        int result = tab[n-1]-tab[0];
//        System.out.println(result);
       
        for (int i = 0; i < m-n+1; i++) {
            for (int j = 0; j <n; j++) {
                temp [j] = tab[j+i];
               // System.out.print(temp[j]+" ");
                //result = Math.min(tab[n-1]-tab[0], result);
            }
            
            result = Math.min(temp[n-1]-temp[0], result);
            
            //System.out.println(result);
            //System.out.println("");
        }
        System.out.println(result);
    }
    
}
