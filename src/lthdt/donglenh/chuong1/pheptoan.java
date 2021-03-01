/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author Administrator
 */
public class pheptoan {
    public static void main(String[] args) {
        //cac phep toan voi so nguyen
//        int a = 17, b=4, c;
//        c = a + b;
//        System.out.println("Phep cong" + a + " + " + b + " = " + c);
//        c=b-a;
//        System.out.println("Phep tru" + a + " - " + b + " = " + c);
//        c=a*b;
//        System.out.println("Phep nhan" + a + " * " + b + " = " + c);
//        c=a/b;
//        System.out.println("Phep chia phan nguyen" + a + " / " + b + " = " + c);
//        c=a%b;
//        System.out.println("Phep chia phan du" + a + " - " + b + " = " + c);
        
        //cac phep toan voi so thuc
        double x = 14.3, y=3.56,z;
        z=x+y;
        System.out.println("Phep cong" + x + " + " + y + " = " + z);
        z=x-y;
        System.out.println("Phep tru" + x + " - " + y + " = " + z);
        z=x*y;
        System.out.println("Phep nhan" + x + " * " + y + " = " + z);
        z=x/y;
        System.out.println("Phep chia" + x + " / " + y + " = " + z);
        
        //cac phep toan tren kieu logic
        boolean flag1 = true, flag2 = false, flag3=true;
        System.out.println("Phep AND" + (flag1 && flag2));
        System.out.println("Phep OR" + (flag1 || flag2));
        System.out.println("Phep NOT" + (!flag1));
        System.out.println("Phep XOR" + (flag1^flag3));
        
        //MOT SO PHEP TOAN CO BAN TREN CHUOI
        String s1 = "HUE UNIVERSITY";
        String s2 = " UNIVERSITY";
         System.out.println(s1.toLowerCase());
         System.out.println(s2.toUpperCase());
         System.out.println(s1.toLowerCase().contains(s2));
         s1 += "" + s2;
         System.out.println(s1);
    }
    
}
