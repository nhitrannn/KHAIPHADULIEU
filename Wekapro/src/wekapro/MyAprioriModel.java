/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.associations.Apriori;
import weka.core.Instances;

/**
 *
 * @author Administrator
 */
class MyAprioriModel extends myknowledgemodel {
    Apriori apriori;
    Instances newData;

    
    
    

   
    

    public MyAprioriModel(String filename, String m_otps, String d_otps) throws Exception {
        super(filename, m_otps, d_otps);
        this.apriori = new Apriori();
    }
    
    
    

   
    
    public void mineAssociationaRules() throws Exception {
        //loc du lieu
//        this.newData = removeData(this.dataset);
        this.newData = convertData(dataset);
        //thiet lap thong so cho model apriori
        apriori.setOptions(this.model_options);
        //kahi pha lluat ket hop
        apriori.buildAssociations(this.newData);
        
        
    }

    @Override
    public String toString() {
        return apriori.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
