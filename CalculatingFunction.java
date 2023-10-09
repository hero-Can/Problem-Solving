/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatingfunction;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CalculatingFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 == 0){
            System.out.println(n/2);
        }else{
            System.out.println(-1*((n/2)+1));
        }
        
    }
    
}
