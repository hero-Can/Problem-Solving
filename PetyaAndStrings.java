/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petyaandstrings;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PetyaAndStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int result = s1.compareTo(s2);
    
        if(result == 0){
            System.out.println(0);
        }
        else if(result>0){
            System.out.println(1);
        }
        else if(result<0){
            System.out.println(-1);
        }
    }
    
}
