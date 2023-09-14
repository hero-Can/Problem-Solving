/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beautifulyear;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BeautifulYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        boolean flag =true;
       while(flag ==true) {
           n++;
           int a=n/1000;
           int b=n/100%10;
           int c=n/10%10;
           int d=n%10;
           if(!(a==b||a==c||a==d || b==c || b==d || d==c)){
            flag=false;
           }
       }
        System.out.println(n);
    }
}
