/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luckydivision;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class LuckyDivision {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int count=0;
        while(temp!=0){
            if( temp%10==4 || temp%10==7){
                count++;
            }
            temp = temp/10;
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else if( n%4==0 || n%7==0 || n%44==0 || n%77==0 || n%47==0 || n%74==0 
                || n%444==0 || n%777==0 || n%447==0 || n%477==0 || n%774==0  
                || n%744==0 ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
    }
    
}
