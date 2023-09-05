/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nearlyluckynumber;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NearlyLuckyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count=0;
       
        while(n!=0){
            if( n%10 ==4 || n%10 == 7){
                count++;
            }
            n = n/10;
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
