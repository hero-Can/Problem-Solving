/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultra.fast.mathematician;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class UltraFastMathematician {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = s1.length();
        char [] tab1 =s1.toCharArray();
        char [] tab2 =s2.toCharArray();
        char [] tab3 =new char[n];
        
        for (int i = 0; i < n; i++) {
            if(tab1[i]==tab2[i]){
                tab3[i]='0';
            }else{
                tab3[i]='1';
            }    
        }
        for (int j = 0; j < n; j++) {
            System.out.print(tab3[j]);
        }
        
    }
    
}
