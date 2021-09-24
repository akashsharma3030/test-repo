package com.demo.noexception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.machinezoo.noexception.Exceptions;

public class NoExceptionCheckedException {

	public static void main(String[] args) {
	
		printfileContentWithTryCatch();
		
		printfileContent();
	}
	
	private static void printfileContentWithTryCatch()
	{
		
	    	try {
				System.out.println(Files.readString(
						Paths.get("test")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception with Try Catch");
			}
		 
	}
	
	
	private static void printfileContent()
	{
		System.out.println("Inside method printfileContent");
		String result =Exceptions.log()
	    .get(Exceptions.sneak().supplier(() -> Files.readString(
	    		Paths.get("test")))).orElse("No File Found");
		
		System.out.println(result);
	}

}
