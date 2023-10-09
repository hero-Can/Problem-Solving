/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expression;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Expression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1=a+b*c;
        int result2=a*(b+c);
        int result3=a*b*c;
        int result4=(a+b)*c;
        int result5=a+b+c;
        int max1=Math.max(result1,result2);
        int max2=Math.max(result3,result4);
        int max=Math.max(max1,max2);
        System.out.println(Math.max(max,result5));
    }
    
}
