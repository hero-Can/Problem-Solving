/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insomniacure;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class InsomniaCure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count=0;
        for (int i = 1; i <= d; i++) {
            if (i%k==0 || i%l==0 || i%m==0 || i%n==0) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
