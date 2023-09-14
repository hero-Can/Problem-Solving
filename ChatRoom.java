/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatroom;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ChatRoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = "hello";
        int count=0;//ahhellllloou
                    //hello
      for (int i = 0; i < s1.length(); i++) {
          
              if(s1.charAt(i) == s2.charAt(count)){
                count++;
               
             }
         if(count==5){
             break;
         }
           
        }
      if(count == 5){
          System.out.println("YES");
      }
      else{
          System.out.println("NO");
      }
    }
    
}
