/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenodds;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EvenOdds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long middle = n / 2;
        long result;
        if (n % 2 == 0) {
            // odd numbers
            if (k <= middle) {
                result = (k * 2) - 1;
            } // even numbers
            else {
                result = (k - middle) * 2;
            }

        } else {
            if (k <= (middle + 1)) {
                result = (k * 2) - 1;
            } // even numbers
            else {
                result = (k - (middle + 1)) * 2;
            }
        }
        System.out.println(result);
    }

}
