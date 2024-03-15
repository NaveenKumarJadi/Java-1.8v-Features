package com.naveen9.streams;


import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		//Approach - 1
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Albert");
		names.add("John");
		names.add("Mic");
		System.out.println(names);
		
		//Approach - 2
		Stream<String> stream2 = names.stream();
	}
}
