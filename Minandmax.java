/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minandmax;

import java.util.Arrays;
import java.util.Scanner;

public class Minandmax {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        //    method 1
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }else{
                min = arr[i];
            }
        }
        System.out.println(min+" "+max);
        
        
        //    method 2
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[size-1]);
    }
    
}
