/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stonesonthetable;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class StonesOnTheTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =sc.next();
        char [] tab =s.toCharArray();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(i!=n-1 && tab[i]==tab[i+1] ){ 
                count++;
            }   
        }
        System.out.println(count);
    }
    
}
