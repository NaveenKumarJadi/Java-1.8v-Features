package com.naveen.requirement;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplIteratorDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Dhoni", "sachin", "virat");
		
		Spliterator<String> spliterator = names.stream().spliterator();
		spliterator.forEachRemaining(n -> System.out.println(n));

	}
}
