/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package georgeandaccommodation;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class GeorgeAndAccommodation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q-p>=2){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
