/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffeelogic.Product;
import lthdt.chuong3.coffeelogic.ProductCompByPrice;
import lthdt.chuong3.coffeelogic.productCompByName;

/**
 *
 * @author Administrator
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tao mang cac san pham
        Product[] sp = new Product[]
        {
            new Product("Sunsilk", 12),
            new Product("Lifebouy", 5),
            new Product("Sunsilk", 8),
            new  Product("Khan Giay", 2),
            new Product("but chi", 3)
        
        };
        System.out.println("Mang ban dau la: ");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//        for( int i=0; i < sp.length - 1; i++)
//        {
//            for(int j=i+1; j < sp.length; j++); 
//            {
//                int j = 0;
//                
//                if(sp[i].getPrice() > sp[j].getPrice())
//                {
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                    
//                }
                //sap xep mang theo gia ca tang dan
//                Arrays.sort(sp, new ProductCompByPrice());
//                System.out.println("Mang sap xep tang dan theo gia ca: ");
//                System.out.println(Arrays.toString(sp));
                System.out.println("Sap xep san pham theo ten:");
                Arrays.sort(sp, new productCompByName());
                System.out.println(Arrays.toString(sp));
                
                int index = Arrays.binarySearch(sp, new Product("Sunsilk", 12), new productCompByName());
                if(index < 0){
                    System.out.println("Khong tim thay");
                }else{
                    System.out.println("Phan tu thu " + index + " chua gia tri can tim");
                    System.out.println(sp[index]);
                    
        
    }
                
                
            }
        }




    

