/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nextround;

import java.util.Scanner;

public class NextRound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int tab[]= new int[n];
        int temp;
        int count=0;
        for (int i = 0; i < n; i++) {
            tab[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {  
            for (int j = i + 1; j < n; j++)   
            {  
             if (tab[i] < tab[j]){  
                temp = tab[i];  
                tab[i] = tab[j];  
                tab[j] = temp;  
               }  
            }  
         }  
        int value=tab[k-1];
        for (int i = 0; i < n; i++) {
            if(tab[i]>=value && tab[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
