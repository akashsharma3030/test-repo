package com.demo.noexception;

import java.util.List;

import com.machinezoo.noexception.Exceptions;

public class NoExceptionPassThroughExample {

	public static void main(String[] args) {
		printString();

	}

	private static void printString() {
		for (String item : List.of("JavaWorld", "R", "ScalaWorld")) {
			System.out.println(Exceptions.log().passing().get(() -> item.substring(4)));
		}
		System.out.println("Print String Method Executed Sucessfully");
	}

}
