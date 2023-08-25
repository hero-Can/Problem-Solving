/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package theatresquare;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TheatreSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        
        int v1=n/a;
        int v2=m/a;
        if(n%a>0){
             v1++;  
        }
        if(m%a>0){
            v2++; 
        }
        long result= (long)v1*v2;
        System.out.println(result);
        
    }
    
}
