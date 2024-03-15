package com.naveen1.predicate;

import java.util.function.Predicate;

//	Declare name in an array and print names which are starting with “A” using Lambda Expression

public class PredicateDemo2 {

	public static void main(String[] args) {

		String[] names = { "Ram", "Raj", "Ravi", "Bunny", "Shiva", "Raghu", "Rickky" };

		Predicate<String> p = name -> name.charAt(0) == 'R';

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}
}
