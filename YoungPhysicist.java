/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package youngphysicist;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class YoungPhysicist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xsum=0,ysum=0,zsum=0;
        for (int i = 0; i < n; i++) {
            int x =sc.nextInt();
            int y =sc.nextInt();
            int z =sc.nextInt();
            xsum+=x;
            ysum+=y;
            zsum+=z;
        }
        if(xsum==0 && ysum==0 && zsum==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
