/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.logiclayer;

/**
 *
 * @author Administrator
 */
public class PhuongTrinhBac1 implements GiaiPTInterface {
    private double a;
    private double b;
    private double nghiem_x;
    private String Ketqua;

    public PhuongTrinhBac1() {
    }

    public PhuongTrinhBac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void giaiPhuongTrinh() {
        if(a !=0){
            nghiem_x = -b/a;
            Ketqua="Phuong trinh bac 1 co nghiem la " + nghiem_x;
            
        }else{
            if(b !=0)
            Ketqua="Phuong trinh bac 1 vo nghiem ";
        
            else {
                
                Ketqua="Phuong trinh bac 1 co vo so nghiem";
            }
        
    }
        
           
     
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return Ketqua;
    }

    public void setKetqua(String Ketqua) {
        this.Ketqua = Ketqua;
    }

    @Override
    public String toString() {
       if(Ketqua==null || Ketqua.isEmpty()) {
           giaiPhuongTrinh();
       }
       return Ketqua;
    }
    
}
    

