/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.donglenh;

/**
 *
 * @author Administrator
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi bong vang";
        System.out.println(content);
        //thao tac 1: tim vi tri cua mot ki tu
        System.out.println("vi tri cua ki tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("vi tri cua tu nuoc trong chuoi la: " + content.indexOf("nuoc"));
        //thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("chuoi mo dau bang cum tu Long: " + content.startsWith("Long"));
        System.out.println("chuoi ket thuc bang cum tu Troi: " + content.endsWith("Troi"));
        //thao tac 3: cat chuoi theo vi tri
        String temp = content.substring(20, 26);
        System.out.println("chuoi con la: " + temp);
        //thao tac 4:phan tach chuoi
        String[] result = content.split("\n");
        for(int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        //thao tac 5: loai bo khoang trangdau cuoi chuoi
        for(int i=0; i < result.length; i++){
            System.out.println(result[i].trim());
        }
        //thao tac 6: thay the ki tu
        temp = content.replace('a', 'z');
        System.out.println(temp);
        //thao tac 7: chuyen kieu
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        //thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareTo("nguyen")==0) {
            System.out.println("2 chuoi bang nhau");
            
        }else{
            System.out.println("2 chuoi khong bang nhau");
        }
        //thao tac 9: noi chuoi
        temp = temp.concat(" Van A");
        System.out.println(temp);
        
        //thao tac 10: truy suat bang chi so
        for(int i=0; i<temp.length();i++){
            System.out.print(temp.charAt(i));
        }
        System.out.println();
        
        //thao tac 10: chuyen kieu
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = " + n);
        
        //thao tac 11:Su dung String Builder
        StringBuilder sb = new StringBuilder();
        sb.append("Long lanh day nuoc in troi\n");
        sb.append("Thanh xay khoi biec non phoi bong vang");
        temp = sb.toString();
        System.out.println(sb);
        
        
        
        
        
        
        
        
    }
    
}
