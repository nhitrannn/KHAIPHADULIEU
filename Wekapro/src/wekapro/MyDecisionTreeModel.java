/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Debug;
import weka.core.Debug.Random;
import weka.core.Instances;

/**
 *
 * @author Administrator
 */
public class MyDecisionTreeModel extends myknowledgemodel {
    J48 tree;
    
    
    public MyDecisionTreeModel(String filename, String m_otps, String d_otps) throws Exception {
        super(filename, m_otps, d_otps);
    }
    public void buildDecisionTree() throws Exception {
        //tao tap du lieu train va test
        this.trainset = divideTrainTestR(this.dataset, 80, false);
        this.testset = divideTrainTestR(this.dataset, 80, true);
        this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
        this.testset.setClassIndex(this.testset.numAttributes() - 1);
        
        
        //thiet lap thong so cho mo hinh cay quyet dinh
        tree = new J48();
        tree.setOptions(this.model_options);
        
        //huan luyen mo hinh voi du lieu train
        tree.buildClassifier(this.trainset);
        
    }
    public void  evaluateDicisionTree() throws Exception{
        Random rnd = new Debug.Random(1);
        int folds = 10;
        Evaluation eval = new Evaluation(this.trainset);
        eval.crossValidateModel(tree, this.testset, folds, rnd);
        eval.evaluateModel(tree, this.testset);
        System.out.println(eval.toSummaryString(
                "\nKet qua danh gia mo hinh 10-fold cross-validation\n-----\n",false));
        
    }
    
    public void predictClassLabel(Instances input) throws Exception{
        for(int i = 0; i< input.numInstances(); i++){
            double predict = tree.classifyInstance(input.instance(i));
            double actual = input.instance(i).classValue();
            System.out.println("Instance " + i + ": predict = " +
                                input.classAttribute().value((int)predict) +
                                        "; actual = " + 
                                        input.classAttribute().value((int)actual));
            //input.instance(i).setClassValue(predict);
        }
        
        
    }

    @Override
    public String toString() {
        return tree.toSummaryString();
    }
    
    
    
}
