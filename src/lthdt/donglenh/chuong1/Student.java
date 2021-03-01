/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Student extends Person {
    private String truonghoc;

    public Student() {
    }

    public Student(String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    public void getTruonghoc(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
