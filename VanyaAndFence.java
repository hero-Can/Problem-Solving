/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vanyaandfence;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class VanyaAndFence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int count1=0,count2=0;
        int result;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a<=h){
                count1++;
            }
            else{
                count2++;
            }
        }
        result=count1+(count2*2);
        System.out.println(result);
    }
    
}
