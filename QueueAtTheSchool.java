/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueattheschool;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class QueueAtTheSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t =sc.nextInt();
        String s =sc.next().toUpperCase();
        char temp ;
        char [] tab = s.toCharArray();
        
       for(int x=0 ;x<t;x++){
           for (int i = 0; i < n-1; i++) {
               if(tab[i]=='B' && tab[i+1]=='G'){
                temp = tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=temp;
                i++;
            }
          }
       }
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i]);
        }
        
    }
    
}
