/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pangram;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Pangram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        if (n<26) {
            System.out.println("NO");
        }else{
            if (  s.contains("a")&&s.contains("b")&&s.contains("c")&&s.contains("d")&&s.contains("e")&&s.contains("f")
                &&s.contains("g")&&s.contains("h")&&s.contains("i")&&s.contains("j")&&s.contains("k")&&s.contains("l")
                &&s.contains("m")&&s.contains("n")&&s.contains("o")&&s.contains("p")&&s.contains("q")&&s.contains("r")
                &&s.contains("s")&&s.contains("t")&&s.contains("u")&&s.contains("v")&&s.contains("w")&&s.contains("x")
                &&s.contains("y")&&s.contains("z")) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
    
}
