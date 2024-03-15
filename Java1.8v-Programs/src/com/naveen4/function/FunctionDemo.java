package com.naveen4.function;

import java.util.function.BiFunction;
import java.util.function.Function;

// Retrieve student record based on student id and return that record

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = (name) -> name.length();

		System.out.println(f.apply("Navin"));
		System.out.println(f.apply("Navin Kumar"));
		System.out.println(f.apply("Jerome Powell"));
		
		System.out.println("******* BiFunction *******");

		BiFunction<Integer, Integer, Integer> bif = (a, b) -> (a+b);
		System.out.println(bif.apply(10, 20));
		
	}
}
