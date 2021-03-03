/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.associations.FPGrowth;
import weka.core.Instances;

/**
 *
 * @author Administrator
 */
public class MyFPGrowtModel extends myknowledgemodel {
    
    Instances newData;
    FPGrowth fp;





   
    


    
    

    
    

    
    
    

    public MyFPGrowtModel(String filename, String m_otps, String d_otps) throws Exception {
        super(filename, m_otps, d_otps);
        this.fp = new FPGrowth();
    }
    public void mineAssociationRules() throws Exception {
        //loc du lieu
        //this.newData = removeData(this.dataset);
         this.newData = convert2Binary(dataset);
        //thiet lap thong so
        fp.setOptions(this.model_options);
        //khai pha
        fp.buildAssociations(this.newData);
    }
    

    @Override
    public String toString() {
        return fp.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    }

    
    

    
    

   
    

    
    
    

