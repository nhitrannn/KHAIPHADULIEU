/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import lthdt.chuong3.coffeelogic.Bill;
import lthdt.chuong3.coffeelogic.Product;

/**
 *
 * @author Administrator
 */
public class testBILL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Bill a = new Bill(12, new Product[]{
                    new Product("Shampo", 12),
                    new Product("Closeup", 21)});
        System.out.println("a = " + a);
        
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        System.out.println("a = " + a);
        System.out.println("temp = " + temp);
        
        }
        
    }
    

