/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Administrator
 */








public class bai6 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "22-3-2000";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Tran Tuyet Nhi", 0, ngaysinh);
        
        System.out.println("Ho ten: " + person.getHoten() + "; gioi tinh: " + person.getGioitinh() + "; Ngay sinh: " +
                df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("24-3-2000"));
        sinhvien.setTruonghoc("Kinh te Hue");
        System.out.println(sinhvien.getHoten() + "; gioi tinh " + sinhvien.getGioitinh() + 
                "; ngay  sinh " + df.format(sinhvien.getNgaysinh()) +  "; " + sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Tran Tuyet Nhi ");
        congnhan.setGioitinh(1);
        congnhan.setNgaysinh(df.parse("02-09-2001"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten() + "; gioi tinh:" +
                congnhan.getGioitinh() + "; ngay sinh: " +
                df.format(congnhan.getNgaysinh()) + "; cong ty: " +
                congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
                
        
                   
    }
}
