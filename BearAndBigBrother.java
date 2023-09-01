/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bearandbigbrother;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BearAndBigBrother {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        while(a<=b){
            a = a*3;
            b= b*2;
            count++;
        }
        System.out.println(count);
    }
    
}
