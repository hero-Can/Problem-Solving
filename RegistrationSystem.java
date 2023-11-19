/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RegistrationSystem {

    public static void main(String[] args) {
//        First Method
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s;
//        ArrayList<String> requests = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            s=sc.next();
//            if (requests.contains(s)) {
//                int occurrences = Collections.frequency(requests,s);
//                System.out.println(s+""+occurrences);
//            }else{
//                System.out.println("OK");
//            }
//            requests.add(s);
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> strings = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (!strings.containsKey(name)) {
                System.out.println("OK");
                strings.put(name, 0);
            }
            else{
                int result = strings.get(name)+1;
                strings.put(name, result);
                System.out.println(name+result);
            }
        }

    }
    
}
