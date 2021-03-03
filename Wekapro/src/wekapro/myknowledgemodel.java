/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.File;
import java.io.IOException;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NominalToBinary;
import weka.filters.unsupervised.attribute.NumericToNominal;
import weka.filters.unsupervised.attribute.Remove;

/**
 *
 * @author Administrator
 */
public class myknowledgemodel {
    DataSource source;
    Instances dataset;
    String[] model_options;
    String[] data_optioins;

    public myknowledgemodel(String filename, String m_otps, String d_otps) throws Exception {
        this.source = new DataSource(filename);
        this.dataset = source.getDataSet();
        this.model_options = weka.core.Utils.splitOptions(m_otps);
        this.data_optioins = weka.core.Utils.splitOptions(d_otps);
    }

    myknowledgemodel(String cProgram_FilesWeka385datairisarff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public Instances removeData(Instances originalData) throws Exception {
         Remove remove = new Remove();
         remove.setOptions(data_optioins);
         remove.setInputFormat(originalData);
         return Filter.useFilter(originalData, remove);
         
     }
     public Instances convertData(Instances originalData) throws Exception{
         NumericToNominal n2n = new NumericToNominal();
         n2n.setOptions(data_optioins);
         n2n.setInputFormat(originalData);
         return Filter.useFilter(originalData, n2n);
     }
     public Instances convert2Binary(Instances originalData) throws Exception {
         NominalToBinary n2b = new NominalToBinary();
         n2b.setOptions(data_optioins);
         n2b.setBinaryAttributesNominal(true);
         n2b.setInputFormat(originalData);
         return Filter.useFilter(originalData, n2b);
     }
    
    
    
    public void savedata(String filename) throws IOException{
        ArffSaver outdata = new ArffSaver();
        outdata.setInstances(this.dataset);
        outdata.setFile(new File(filename));
        outdata.writeBatch();
        System.out.println("Finished");
    }
    
    public void saveData2CSV(String filename) throws IOException{
        CSVSaver outdata = new CSVSaver();
        outdata.setInstances(this.dataset);
        outdata.setFile(new File(filename));
        outdata.writeBatch();
        System.out.println("Converted");
    }
    

    @Override
    public String toString() {
        return dataset.toSummaryString(); //To change body of generated methods, choose Tools | Templates.
    }

    void savedata2CSV(String ddatairis_CSVcsv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
