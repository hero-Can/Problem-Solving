/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isyourhorseshoeontheotherhoof;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class IsYourHorseshoeOnTheOtherHoof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        
        numbers.add(s1);
        numbers.add(s2);
        numbers.add(s3);
        numbers.add(s4);

        System.out.println(4 - numbers.size());

    }

}
