package com.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionExample {

	private static Logger logger = LoggerFactory.getLogger(ExceptionExample.class);
	
	public static void main(String[] args) {
		
	//Test Commit
		int [] arraryNumber = new int [] {1,4,5};
		
	    try {
	    	System.out.println(arraryNumber[3]);
	    }
	    catch(ArrayIndexOutOfBoundsException ex)
	    {
	    	logger.error("Error Occured", ex);
	    	System.out.println(0);
	    }
	    catch(NullPointerException ex)
	    {
	    	logger.error("Error Occured", ex);
	    }
	    catch(Exception ex)
	    {
	    	logger.error("Error Occured", ex);
	    }
		
		System.out.println("Test123456");

	}

}
