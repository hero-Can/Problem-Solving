/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketcheckoutsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pc
 */
public class ProductCatalog {
    
    // Map to store product code and Product details
    private static final Map<String, Product> productCatalog = new HashMap<>();

    // Static block to initialize the product catalog
    static {
        productCatalog.put("FR1", new Product("FR1", "Fruit Tea", 3.11));
        productCatalog.put("SR1", new Product("SR1", "Strawberries", 5.00));
        productCatalog.put("CF1", new Product("CF1", "Coffee", 11.23));
    }

    // Method to get product by product code
    public static Product getProductByCode(String productCode) {
        return productCatalog.get(productCode);
    }
}
