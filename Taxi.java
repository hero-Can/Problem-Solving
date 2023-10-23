/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxi;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Taxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=0,c=0,d=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            switch (s) {
                case 1:
                  a++;   
                  break;
                case 2:
                  b++;   
                  break;
                case 3:
                  c++;   
                  break;
                case 4:
                  d++;   
                  break;  
            }
        }
        // group of d(4)
         count=count+d;
         
        //group of c(3)
        count = count+c;
        a=a-c;
        if (a<0) {
            a=0;
        }
        //group of b(2)
        if(b%2 == 0){
            b=b/2;
            count=count+b;
        }else{
            b= (b/2) +1;
            count=count+b;
            a=a-2;
            if (a<0) {
                a=0;
            }
        }
        //group of a(1)
        a=(int)Math.ceil(a/4.0);
        count=count+a;
        System.out.println(count);

    }
    
}
