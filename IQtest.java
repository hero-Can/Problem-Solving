/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iqtest;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class IQtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n =sc.nextInt();
       int count1=0,count2=0;
       int [] tab = new int[n];
       int r=0;
        for (int i = 0; i < n; i++) {
            tab[i] =sc.nextInt();
            if (tab[i]%2!=0 ) {
                count1++;
            }else{
                count2++;
            }
        }
        
       if (count1>count2) {
            for (int i = 0; i < n; i++) {
                if (tab[i]%2==0) {
                    r=i;
                    break;
                }
           }
        }
       else{
           for (int i = 0; i < n; i++) {
                if (tab[i]%2!=0) {
                    r=i;
                    break;
                }
           }
       }
        System.out.println(r+1);
    }
    
}
