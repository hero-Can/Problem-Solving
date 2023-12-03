/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vanyaandlanterns;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class VanyaAndLanterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int [] tab = new int[n];
        boolean flag1=false;
        boolean flag2=false;
        for (int i = 0; i < n; i++) {
            tab[i]=sc.nextInt();
            if (tab[i]==0) {
                flag1=true;
            }
            if (tab[i]==l) {
                flag2=true;
            }
        }
        Arrays.sort(tab);
        int maxDistance=Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++) {
           int newdistance = tab[i+1]-tab[i];
           maxDistance= Math.max(newdistance, maxDistance);
        }
        double result = (double)maxDistance/2.0;
        
        if (flag1 == false) {
            result=Math.max(result,(double)tab[0]);
        }
        if (flag2 == false) {
            result=Math.max(result,(double)(l-tab[n-1]));
        }
        
        System.out.println(result);
    }
    
}
