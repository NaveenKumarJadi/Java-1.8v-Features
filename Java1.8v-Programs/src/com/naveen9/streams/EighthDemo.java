package com.naveen9.streams;

import java.util.Arrays;
import java.util.List;

public class EighthDemo {

	public static void main(String[] args) {

		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "Japan");
		Person p3 = new Person("Navin", "India");
		Person p4 = new Person("Ching", "China");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		boolean status = persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println("Any Indian Available ? :: " + status);

		boolean status2 = persons.stream().anyMatch(p -> p.country.equals("Canada"));
		System.out.println("Any Canadian Available ? :: " + status2);
		
		
		boolean status3 = persons.stream().allMatch(p -> p.country.equals("India"));
		System.out.println("All persons from India ? :: " + status3);

		
		boolean status4 = persons.stream().noneMatch(p -> p.country.equals("Mexico"));
		System.out.println("All persons from Mexico ? :: " + status4);
		
	}

}

class Person {

	String name;
	String country;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

}