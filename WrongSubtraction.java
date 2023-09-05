/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrongsubtraction;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class WrongSubtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if(n%10 !=0){
                n = n-1;
            }
            else{
                n = n/10;
            }
            
        }
        System.out.println(n);
    }
    
}
