/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dubstep;


import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Dubstep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        String [] tab =s.split("WUB");//spilt elimite the word WUB
        String ns ="";
        for (int i = 0; i < tab.length; i++) {
           ns = ns+tab[i]+" ";
        }
         System.out.println(ns.trim());//The trim() method doesn’t eliminate middle spaces.
    }
    
}
