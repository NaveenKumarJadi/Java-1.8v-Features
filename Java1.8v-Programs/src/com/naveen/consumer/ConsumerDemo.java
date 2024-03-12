package com.naveen.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		
		Consumer<String> c = (name) -> System.out.println(name + ", Good Evening");
		
		c.accept("Navin");
		c.accept("Albert");
		c.accept("Monksha");
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		//for loop
		//for each loop
		//iterator
		//list iterator
		
		numbers.forEach(i -> System.out.println(i));
		
		
	}

}
