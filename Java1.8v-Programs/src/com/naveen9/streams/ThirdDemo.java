package com.naveen9.streams;

import java.util.Arrays;
import java.util.List;

public class ThirdDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("india", "usa", "russia", "Japan");

		/*
		 * for(String name : names) { String upperCase = name.toUpperCase();
		 * System.out.println(upperCase); }
		 */

		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));

		names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));
		
	}

}
