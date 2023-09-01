/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soldierandbananas;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SoldierAndBananas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int somme=0;
        for (int i = 1; i <=w; i++) {
             somme = somme+ (k*i);
        }
        if(somme>n){
            int result =somme-n;
            System.out.println(result);
        }
        else{
            System.out.println(0);
        }
    }
    
}
