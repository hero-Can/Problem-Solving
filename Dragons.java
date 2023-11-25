/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dragons;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

import java.util.*;

 class Pair{
     int dragonEnergy;
     int bonus;
    Pair(int dragonEnergy,int bonus){
        this.dragonEnergy=dragonEnergy;
        this.bonus=bonus;
    }
    
}


public class Dragons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int s = sc.nextInt();
          int n = sc.nextInt();
        Pair tab[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            tab[i]= new Pair(x,y);
        }
        Arrays.sort(tab,new Comparator<Pair>(){
        public int compare(Pair p1,Pair p2){
            return p1.dragonEnergy-p2.dragonEnergy;
            }
         });
        
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            Pair dragon =tab[i];
            if(s>dragon.dragonEnergy){
               s=s+dragon.bonus;
            }else{
                flag = false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
        
        
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int n = sc.nextInt();
//        int energy =s;
//        boolean flag =true;
//        Map<Integer,Integer> map = new HashMap<>();
//        TreeMap<Integer,Integer> sorted = new TreeMap<>();
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            map.put(x, y);
//        }
//        sorted.putAll(map);
//        for (Map.Entry<Integer,Integer> entry : sorted.entrySet()) {
////            System.out.println("Key = " + entry.getKey() + 
////                         ", Value = " + entry.getValue());        
//           if (energy>entry.getKey()) {
//                energy=energy+entry.getValue();
//            }
//            else{
//                flag=false;
//                break;
//            }
//        }
//        if (flag==true) {
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
        
        
        
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int n = sc.nextInt();
//        int energy=s;
//        boolean flag =true;
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            if (energy>x) {
//                energy =energy+y;
//            }else{
//                flag=false;
//                break;
//            }
//        }
//        if (flag==true) {
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
    }
    
}
