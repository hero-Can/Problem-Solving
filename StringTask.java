/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtask;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class StringTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        char [] tab =s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(tab[i] == 'a' || tab[i] == 'e' || tab[i] == 'i' || tab[i] == 'o' || tab[i] == 'u'|| tab[i] == 'y' ){
                continue;
            }
            System.out.print("."+tab[i]);
        }
        System.out.println("");
    }
    
}
