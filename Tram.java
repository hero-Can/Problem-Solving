/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tram;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Tram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int [] tab = new int[n];
      
        for (int i = 0; i < n; i++) {
            int out=sc.nextInt();
            int in =sc.nextInt();
            sum=sum-out;
            sum=sum+in;
            tab[i]=sum;
        }
          Arrays.sort(tab);
         System.out.println(tab[n-1]);
        
         
    }
    
}
