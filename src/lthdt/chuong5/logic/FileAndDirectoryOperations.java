/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.logic;

import java.io.File;

/**
 *
 * @author Administrator
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    //thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String folder) {
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
        
    }
        //thao tac 2:xuat kq 
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
            
        }
        return sb.toString();
        
    }
}
