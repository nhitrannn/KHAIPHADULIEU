/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class xuatnhap {
    //<editor-fold defaultstate="collapsed" desc="comment">
    public static void main(String[] args)
    {
        boolean flag = true;
        int a=15;
        byte b= 2;
        double c=12.6;
        float d=4.5f;
        String s="Hello deadline";
        char ch='A';
        
       Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.println("ban da nhap ho ten la: " + hoten);
        
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a= Integer.parseInt(input);
        System.out.println("So nguyen ma ban da nhap la: " + a);
        
        System.out.print("Hay nhap vao mot so thuc: ");
         input = sc.nextLine();
        c= Double.parseDouble(input);
        System.out.println("So thuc ban da nhap la: " + c);
        
    }
//</editor-fold>

            
}
