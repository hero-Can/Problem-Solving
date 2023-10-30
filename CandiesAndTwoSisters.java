/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candiesandtwosisters;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CandiesAndTwoSisters {

    /*
     a=6, b=1
     a=5, b=2
     a=4, b=3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n =sc.nextLong();
            long result=(n-1)/2;
            System.out.println(result);
        }
        
        
        
        
        
        
        
        
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int count=0;
//        long a,b;
//        for (int i = 0; i < t; i++) {
//            count=0;
//            long n = sc.nextLong();
//            a=n-1;
//            b=n-a;
//            while (a>b) {  
//                count++;
//                a--;
//                b=n-a;
//            }
//            System.out.println(count);
//        }
        
    }
    
}
