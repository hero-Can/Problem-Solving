/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarketcheckoutsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class SupermarketCheckoutSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>();
        //List<String> products = new ArrayList<>();
        
        Product p1 = new Product("FR1");
        Product p2 = new Product("SR1");
        Product p3 = new Product("FR1");
        Product p4 = new Product("FR1");
        Product p5 = new Product("CF1");
        System.out.println("total : "+Product.calcTotal());
        
        
//        String pCode = p1.getProductCode();
//        System.out.println("product code is : "+pCode);
//        // get the price of product by productcode
//        System.out.println("the price of the product is : "+ ProductCatalog.getProductByCode(pCode).getPrice());
//        
        
        
    }
    
}
