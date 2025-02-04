/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketcheckoutsystem;

/**
 *
 * @author pc
 */
public class Product {
    String productCode;
    String name;
    double price;
    static int  countFR1=0 ,countSR1=0,countCF1=0;
    static double sum=0;
    static double priceSR = 5,priceFR = 3.11,priceCF = 11.23;
 
    public Product() {
       
    }
    
    public Product(String productCode) {
        this.productCode = productCode;
        
        //count automaticly when you create an product object
        if (this.getProductCode() == "SR1") {
            countSR1++;
            System.out.println(countSR1);
        }else if(this.getProductCode() == "FR1"){
            countFR1++;
        }else if(this.getProductCode() == "CF1"){
            countCF1++;
        }
    }
    
    public Product(String productCode, String name, double price) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
    }
    
    public void scanProduct(){
        if (this.getProductCode() == "SR1") {
            countSR1++;
        }else if(this.getProductCode() == "FR1"){
            countFR1++;
        }else if(this.getProductCode() == "CF1"){
            countCF1++;
        }

        //return this.productCode;
    }
    
    public static double calcTotal(){
        if (countFR1 %2 == 0) {
            countFR1 = countFR1/2;
        }if(countFR1 %2 != 0){
            countFR1 = (countFR1+1)/2;
        }if(countSR1 >= 3){
          priceSR = 4.50;
        }
        sum = countSR1 * priceSR
             +countFR1 * priceFR
             +countCF1 * priceCF;
        return sum;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // Override toString() method to return a readable string representation of the object
    @Override
    public String toString() {
        return "Product Code: " + productCode + ", Name: " + name + ", Price: €" + price;
    }
}
