/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twins;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Twins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tab = new int[n];
        int sum=0,steps=0;
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
            sum+=tab[i];
        }
        int average = sum/2;
        int result=0;
        Arrays.sort(tab);
        for (int i = n-1; i >=0; i--) {
           result+=tab[i];
           steps++;
           if(result>average){
               break;
           }
        }
        System.out.println(steps);
       
    }
    
}
