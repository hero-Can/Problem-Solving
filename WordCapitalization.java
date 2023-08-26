/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordcapitalization;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class WordCapitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ns =s.toUpperCase().toCharArray()[0]+s.substring(1, s.length());
        System.out.println(ns);
    }
    
}
