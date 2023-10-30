/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capslock;

import java.util.Scanner;

/**
 *
 * @author pc
 */

public class CAPSLOCK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] tab =s.toCharArray();
        boolean flag=true;
        for (int i = 1; i < s.length(); i++) {
            if (s.codePointAt(i)>=97) {
                flag=false;
                break;
            }
        }
        if (flag==true) {
            for (int i = 0; i < s.length(); i++) {
                if (s.codePointAt(i)>=97) {
                   tab[i]=(char) Character.toUpperCase(tab[i]);
                }else{
                    tab[i]=(char) Character.toLowerCase(tab[i]);
                }
            }
        }
        for (int i = 0; i <s.length(); i++) {
            System.out.print(tab[i]);
        }
        
//       //get the unicode of character
//        int b=s.codePointAt(0);
//        if (b>=97 || s.equals(s.toUpperCase())) {
//            String ns1 = Character.toString(b-32);//convert the unicode to character
//            String ns2 = s.substring(1).toLowerCase();
//            System.out.println(ns1+ns2);
//        }else{
//            System.out.println(s);
//        }




//               Scanner reader = new Scanner(System.in);
//		String p = reader.next();
//		char[] ch = p.toCharArray();
//		boolean c = true;
//		for(int i=1; i<ch.length; i++)
//		    if(Character.isLowerCase(ch[i]))
//		        c = false;
//		if(c == true)
//		    for(int i=0; i<ch.length; i++)
//		        if(Character.isUpperCase(ch[i]))
//		           ch[i] = Character.toLowerCase(ch[i]);
//		        else
//		           ch[i] = Character.toUpperCase(ch[i]);
//		for(int i=0; i<ch.length; i++)
//		    System.out.print(ch[i]);
                
                
    }
    
}
