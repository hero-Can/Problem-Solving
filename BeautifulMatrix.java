/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beautifulmatrix;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BeautifulMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goodRow=2;
        int goodColumn=2;
        int moves=0;
        
        int tab[][]= new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              tab[i][j]= sc.nextInt();
            }
        }
        
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(tab[i][j]==1){
                    moves=Math.abs(goodRow-i)+Math.abs(j-goodColumn);
                }
            }
        }
        System.out.println(moves);
    }
    
}
