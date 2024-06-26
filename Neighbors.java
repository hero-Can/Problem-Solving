/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package neighbors;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Neighbors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Write the minimum needed number of flagstones
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double f = sc.nextDouble();
        double c = Math.ceil(Math.sqrt(((a*a)+(b*b))));
        
        double width = Math.ceil(c/f);
//        double height = Math.ceil(c/f);
        long result = (long)(width*width);
        
        System.out.println(result);
    }
    
}
