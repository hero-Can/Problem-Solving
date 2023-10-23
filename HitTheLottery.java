/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitthelottery;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class HitTheLottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long  a;
        long sum = 0;
        while (n != 0) {            
            if (n >= 100) {
                a = n / 100;
                n = n % 100;
                sum = sum + a;
            }
            else if (n >= 20) {
                a = n / 20;
                n = n % 20;
                sum = sum + a;
            }
            else if (n >= 10) {
                a = n / 10;
                n = n % 10;
                sum = sum + a;
            }
            else if (n >= 5) {
                a = n / 5;
                n = n % 5;
                sum = sum + a;
            }
            else  if (n >= 1) {
                a = n / 1;
                n = n % 1;
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
    
}
