package com.demo.noexception;

import com.machinezoo.noexception.Exceptions;

public class SimpleNoExceptionExample {

	public static void main(String[] args) {
		int[] numberArray = new int[] { 1, 4, 5 };

		System.out.println("When Array is Null");
		Exceptions.log().run(() -> calculate(null));

		System.out.println("When Array is not Null");
		Exceptions.log().run(() -> calculate(numberArray));
	}

	private static void calculate(int numberArray[]) {
		System.out.println("Sum:"+(numberArray[0] + 3));
	}
}
