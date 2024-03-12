package com.naveen.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = (name) -> name.length();

		System.out.println(f.apply("Navin"));
		System.out.println(f.apply("Navin Kumar"));
		System.out.println(f.apply("Jerome Powell"));

		BiFunction<Integer, Integer, Integer> bif = (a, b) -> (a+b);
		System.out.println(bif.apply(10, 20));
		
	}
}
