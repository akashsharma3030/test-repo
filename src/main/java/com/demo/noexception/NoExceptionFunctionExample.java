package com.demo.noexception;

import java.util.function.Function;

import com.machinezoo.noexception.Exceptions;

public class NoExceptionFunctionExample {

	public static void main(String[] args) {
		Function<String, String> upperCase = x ->  x.toUpperCase();
		
		System.out.println(Exceptions.log().function(upperCase).apply(null).orElse("BLANK"));

	}

}
