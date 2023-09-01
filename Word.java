/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package word;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] tab = s.toCharArray();
        int count1 =0,count2=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(tab[i])){
                count1++;
            } else {
                count2++;
            }
        }
        if(count1>count2){
            System.out.println(s.toUpperCase());
        }
        else if(count2>count1){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
    
}
