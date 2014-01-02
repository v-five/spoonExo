package fr.inria;

import java.io.File;

import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtVariableAccess;
import spoon.support.DefaultCoreFactory;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;
import spoon.support.reflect.code.CtVariableAccessImpl;

/**
 * User: Victor
 * Date: 02/01/14
 * Time: 6:00 PM
 */
public class StatementProcessor extends AbstractProcessor<CtStatement> {
    int i = 0;


    public void process(CtStatement element) {
        i++;
        System.out.println("Statement: "+ i);
        System.out.println(element);
        
        Factory factory = element.getFactory();
        ProcessingManager pm = new QueueProcessingManager(factory);
        AccessVariableProcessor accessProcessor = new AccessVariableProcessor();
        pm.addProcessor(accessProcessor);
        pm.process(element);
        
        System.out.println("-----------------------------------");
    }
    
    
    
    
}
