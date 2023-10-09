/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hulk;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Hulk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i==n){
                if (i%2 !=0) {
                    System.out.print("I hate it ");
                }
                else{
                    System.out.print("I love it ");
                }
            }else{
                if (i%2 !=0) {
                    System.out.print("I hate that ");
                }
                else{
                    System.out.print("I love that ");
                }
            }
        }
    }
    
}
