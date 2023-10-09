/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drinks;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Drinks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum=0;
        double result;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sum+=p;
        }
        result=sum/n;
        System.out.println(result);
    }
    
}
