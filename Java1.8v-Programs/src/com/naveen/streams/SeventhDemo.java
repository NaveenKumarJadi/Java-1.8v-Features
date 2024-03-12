package com.naveen.streams;

import java.util.Arrays;
import java.util.List;

public class SeventhDemo {

	public static void main(String[] args) {

		List<String> javaCourses = Arrays.asList("core java", "adv java", "springboot", "restpi", "microservices");

		javaCourses.stream().limit(3).forEach(c -> System.out.println(c));

		javaCourses.stream().skip(4).forEach(c -> System.out.println(c));

		List<String> names = Arrays.asList("raja", "raghu", "shiva", "guru", "raja", "shiva");
		names.stream().distinct().forEach(name -> System.out.println(name));

	}

}
