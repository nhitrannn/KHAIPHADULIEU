/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong4.logic;

/**
 *
 * @author Administrator
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }
     public int calcFibo(int n){
         //dieu kien dung
         if(n==0)
             return 0;
         if(n==1)
             return 1;
         //loi goi de quy
         return (calcFibo(n-1) + calcFibo(n-2));
     }
    
}
