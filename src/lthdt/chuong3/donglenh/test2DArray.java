/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // khai bao mang 2 chieu
        int[][] matran = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //khoi tao ma tran 2 chieu 5x7
//        matran = new int[5][7];
        //khoi tao gia tri cua ma tram bang cach sinh ngau nhien
        //Random rnd = new Random();
        //Scanner sc = new Scanner(System.in);
//        for(int i=0; i<matran.length; i++)
//            for(int j=0; j<matran[i].length; j++){
                //matran[i][j] = rnd.nextInt(1000);
//                System.out.print("a[" + i + "," + j + "] = ");
//                String input = sc.nextLine();
//                int n = Integer.parseInt(input);
//                matran[i][j] = n;
//            }
        //xuat gia tri cua ma tran ra man hinh
        for(int i=0; i< matran.length; i++){
            for(int j=0; j < matran[i].length; j++)
                System.out.print(matran[i][j] + " ");
            System.out.println(); 
        }
}
}

            
        
        
        
    

    

