package com.naveen1.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

// Take list of persons and print persons whose age is >=18 using Lambda Expression

public class PredicatePersonsDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Jyothi", 26);
		Person p2 = new Person("Monksha", 16);
		Person p3 = new Person("Navin", 36);
		Person p4 = new Person("King", 6);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		Predicate<Person> predicate = p -> p.age >= 18;

		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person.name);
			}
		}

	}

}
