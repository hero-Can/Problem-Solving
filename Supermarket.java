/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author pc
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        double min = 100;
//        for (int i = 0; i < n; i++) {
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//            double result = (m*a) / b ;
//            min = Math.min(result, min);
//        }
//         System.out.println(min);       


     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Double,Double> apples = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double result = a / b ;
           apples.put(result, result * m);
        }
         System.out.println(apples.values().stream().findFirst().get());      
    }
    
}
