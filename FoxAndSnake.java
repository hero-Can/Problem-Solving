/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foxandsnake;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FoxAndSnake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 1 ;
        boolean flag=true;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i%2 == 0) {
//                    System.out.print("#");
//                }else{
//                    if (j == m-1 && flag==true) {
//                        System.out.print("#");
//                        flag=false;
//                         
//                    }
//                    
//                    else{
//                        if (j==0 && flag==false){
//                        System.out.print("#");
//                        flag=true;
//                        
//                        }
//                       System.out.print(".");
//                       
//                    }
//                    
//                }
//               
//            }
//            System.out.println("");
//        }


        for (int i = 0; i < n; i++) {
            
                if (i%2 == 0) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("#");
                    }
                    
                }else{
                    if (flag==true) {
                        for (int j = 0; j < m; j++) {
                            if (j == m-1) {
                               System.out.print("#");
                               flag=false; 
                            }else{
                                System.out.print(".");
                            }
                            
                        }
                        
                         
                    }
                    
                    else{
                        for (int j = 0; j < m; j++) {
                            if (j == 0) {
                               System.out.print("#");
                               flag=true; 
                            }else{
                                System.out.print(".");
                            }
                            
                        }
                       
                    }
                    
                }
               
           
            System.out.println("");
        }
    }
    
}
