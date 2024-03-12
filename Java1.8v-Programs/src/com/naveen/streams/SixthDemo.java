package com.naveen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SixthDemo {

	public static void main(String[] args) {

		List<String> javaCourses = Arrays.asList("core java", "adv java", "springboot");

		List<String> uiCourses = Arrays.asList("html", "css", "bs", "js");

		List<List<String>> courses = Arrays.asList(javaCourses, uiCourses);

//		courses.stream().forEach(c -> System.out.println(c));

		Stream<String> fms = courses.stream().flatMap(s -> s.stream());

		fms.forEach(c -> System.out.println(c));

	}

}
