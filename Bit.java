/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bit;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for (int i = 0; i < n; i++) {
            String str=sc.next();
            if(str.equals("X++") || str .equals("++X")){
                x++;
            }
            
            else{
                x--;
            }
        }
        System.out.println(x);
        
    }
    
}
