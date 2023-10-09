/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisibilityproblem;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class DivisibilityProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a= sc.nextLong();
            long b= sc.nextLong();
            if(a%b != 0){
                System.out.println(b-a%b);
            }else{
                System.out.println(0);
            }
            
        }
    }
    
}    
 //       Time exced
//        int count;
//        for (int i = 0; i < t; i++) {
//            count=0;
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            while (a%b !=0) {                
//                a++;
//                count++;
//            }
//            System.out.println(count);
//        }
        

        
    
