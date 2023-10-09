/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hq9;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class HQ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      //  char [] tab = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9'){
                System.out.println("YES");
                break;
            }else{
                System.out.println("NO");
                break;
            }
        }
    }
    
}
