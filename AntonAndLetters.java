/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antonandletters;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AntonAndLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) ==' ' || s.charAt(i) ==',' || s.charAt(i) =='{' || s.charAt(i) =='}')) {
                letters.add(s.charAt(i));
            }
            
        }
        System.out.println(letters.size());
    }
    
}
