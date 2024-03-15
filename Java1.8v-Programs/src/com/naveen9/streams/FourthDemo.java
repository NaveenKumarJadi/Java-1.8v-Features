package com.naveen9.streams;

import java.util.Arrays;
import java.util.List;

public class FourthDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Albert", "Ashok", "John", "Michel", "Oleg");

		// print name with its length which are starting with 'A' using Stream API

		names.stream()
			 .filter(name -> name.startsWith("A"))
			 .map(name -> name + "-" + name.length())
			 .forEach(name -> System.out.println(name));
	}

}
