/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package translation;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Translation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();//code
        String t = sc.next();//edoc
        String temp="";
        for (int i = s.length()-1; i >=0 ; i--) {
           temp =temp+s.charAt(i);
        }
        if(t.equals(temp)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
