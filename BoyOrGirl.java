/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boyorgirl;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BoyOrGirl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> h = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
             h.add(s.toCharArray()[i]);
        }
        int n =h.size();
        if(n%2 != 0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
    }
    
}
