/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package team;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Team {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
       
        for (int i = 0; i < num; i++) {
            
            int v1 =sc.nextInt();
            int v2 =sc.nextInt();
            int v3 =sc.nextInt();
            
            if((v1+v2+v3)>=2){
                count++;
            }  
         } 
        System.out.println(count);
    }
    
}
