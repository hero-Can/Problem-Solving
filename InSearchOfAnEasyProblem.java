/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insearchofaneasyproblem;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class InSearchOfAnEasyProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag =false;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if(m == 1){
                flag=true;
                break;
            }
       }
        if(flag == true){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
    
}
