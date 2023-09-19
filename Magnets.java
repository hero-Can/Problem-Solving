/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magnets;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Magnets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tab = new int[n];
        int count=1;
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(tab[i]!=tab[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
