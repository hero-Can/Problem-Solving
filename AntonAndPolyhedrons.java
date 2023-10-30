/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antonandpolyhedrons;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AntonAndPolyhedrons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=0,x;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Tetrahedron")) {
                x=4;
                total=total+x;
            }
            if (s.equals("Cube")) {
                x=6;
                total=total+x;
            }
            if (s.equals("Octahedron")) {
                x=8;
                total=total+x;
            }
            if (s.equals("Dodecahedron")) {
                x=12;
                total=total+x;
            }
            if (s.equals("Icosahedron")) {
                x=20;
                total=total+x;
            }
        }
        System.out.println(total);
    }
    
}
