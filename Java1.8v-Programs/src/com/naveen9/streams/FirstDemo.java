package com.naveen9.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(66, 32, 45, 12, 20);

		/*
		 * for (Integer i : list) { if (i > 20) { System.out.println(i); } }
		 */

		/*
		 * Stream<Integer> stream = list.stream(); Stream<Integer> filteredstream =
		 * stream.filter(i -> i > 20); filteredstream.forEach(i ->
		 * System.out.println(i));
		 */

		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

		
		// Name start with character "A"
		List<String> asList = Arrays.asList("John", "Albert", "Kiran", "Smith", "Oleg", "Ananya");

		asList.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));

	}

}
