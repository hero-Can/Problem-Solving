/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gravityflip;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class GravityFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i]=sc.nextInt();
        }
        Arrays.sort(tab);
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i]+" ");
        }
 
    }
    
}
