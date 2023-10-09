/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iwannabetheguy;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class IWannaBeTheGuy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> tab = new HashSet<>();
        
            int x = sc.nextInt();
            for (int i = 0; i < x; i++) {
                int p=sc.nextInt();
                tab.add(p);
            }
            int y = sc.nextInt();
            for (int j = 0; j < y; j++) {
                int q=sc.nextInt();
                tab.add(q);
            }
          if (tab.size()==n) {
              System.out.println("I become the guy.");
          }
          else{
              System.out.println("Oh, my keyboard!");
          }
     
    }
    
}
