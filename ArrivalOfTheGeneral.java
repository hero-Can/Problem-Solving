/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrivalofthegeneral;


import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ArrivalOfTheGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int min=101;
        int maxPosition=0;
        int minPosition=0;//2 88 89
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if(num>max){
                max=num;
                maxPosition=i;
            }
            if (num<=min) {
                min=num;  
                minPosition=i; 
            }
        }
//        System.out.println("maxPosition "+maxPosition);
//        System.out.println("minPosition "+minPosition);
        if (maxPosition<minPosition) {
            System.out.println((maxPosition-1)+(n-minPosition));
        }
        else{
            System.out.println((maxPosition-1)+(n-(minPosition+1)));
        }
        
    }
    
}
