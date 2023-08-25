/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helpfulmaths;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class HelpfulMaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char tab[]= s.toCharArray();

        Arrays.sort(tab);
        int n=s.length();
        for (int i = n/2; i < n; i++) {
            
           System.out.print(tab[i]);
            if(i != n-1){
                System.out.print("+");
            }
           
        }
        
    }
    
}
