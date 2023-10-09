/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presents;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Presents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tab1 =new int[n+1];
        int [] tab2 = new int[n+1];
        for (int i = 1; i <=n; i++) {
            tab2[i]= sc.nextInt();
            tab1[tab2[i]]=i;
        }
        for (int i = 1; i <=n; i++) {
            System.out.print(tab1[i]+" ");
        }
        System.out.println("");      
        
    }
    
}
