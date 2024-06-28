/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restoringpassword;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class RestoringPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n =0,m=10;
        String result ="";
        String tab[] = new String[8];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            tab[i] = s.substring(n, m);
            n = n+10;
            m = m+10;   
        }
        
        for (int i = 0; i < 10; i++) {
            String s1 = sc.next();
            map.put(s1,i);    
        }
        
        for (int i = 0; i < 8; i++) {
            result += map.get(tab[i]);
        }
        
        System.out.println(result);
        
   
    }
    
}
