/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watermelon;

import java.util.Scanner;


public class Watermelon {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
       if(num%2==0 && num!=2){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
    }
    
}
