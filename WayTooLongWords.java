/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waytoolongwords;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class WayTooLongWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String word = sc.next();
            int count=0;
            if(word.length()>10){
               for (int j = 1; j < word.length()-1; j++) {
                count =j;
              }
                System.out.println(word.toCharArray()[0]+""+count+""+word.toCharArray()[word.length()-1]);
            }
            else{
                System.out.println(word);
            }
        }
    }
    
}
