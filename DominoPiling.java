/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dominopiling;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class DominoPiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int result= (n*m)/2;
        System.out.println(result);
    }
    
}
