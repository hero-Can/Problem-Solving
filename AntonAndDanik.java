/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antonanddanik;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AntonAndDanik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =sc.next();
        char[]tab=s.toCharArray();
        int count1=0,count2=0;
        for (int i = 0; i < n; i++) {
            if(tab[i]=='A'){
                count1++;
            }
            else if(tab[i]=='D'){
                count2++;
            }
        }
        if(count1>count2){
            System.out.println("Anton");
        }
        else if(count2>count1){
            System.out.println("Danik");
        }
        else if(count1==count2){
            System.out.println("Friendship");
        }
    }
    
}
