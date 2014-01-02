package fr.inria;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtElement;

public class AccessVariableProcessor extends AbstractProcessor<CtVariableAccess> {

	  int i=0;

	  @Override
	  public void process(CtVariableAccess element) {
		  i++;
		  System.out.println("variable access "+i+": " +element);
	  }
	  
	 
	}
