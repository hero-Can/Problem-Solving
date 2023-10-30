/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amusingjoke;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AmusingJoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = s1+s2;
        boolean flag =true;
        char [] tab1 = s3.toCharArray();
        char [] tab2 = s4.toCharArray();
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        for (int i = 0; i < s3.length(); i++) {
            if (tab1[i]!=tab2[i]) {
                flag=false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
