/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package football;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Football {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s =sc.next();
        if(s.contains("0000000") ||s.contains("1111111")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
