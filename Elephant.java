/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elephant;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Elephant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int result;
        if(x%5 !=0){
            result=(x/5)+1;
            System.out.println(result);
        }else{
            result=x/5;
            System.out.println(result);
        }
        
        
    }
    
}
