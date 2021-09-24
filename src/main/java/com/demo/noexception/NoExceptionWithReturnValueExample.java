package com.demo.noexception;

import com.machinezoo.noexception.Exceptions;

public class NoExceptionWithReturnValueExample {

	public static void main(String[] args) {
		
		System.out.println(
			    Exceptions.log().get(() -> 
			    "Java".substring(7)).orElse("Some Message"));
		
		

	}

}
