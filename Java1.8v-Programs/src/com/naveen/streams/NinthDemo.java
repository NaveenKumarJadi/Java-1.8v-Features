package com.naveen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NinthDemo {

	public static void main(String[] args) {

		Persons p1 = new Persons("John", "USA");
		Persons p2 = new Persons("Steve", "Japan");
		Persons p3 = new Persons("Navin", "India");
		Persons p4 = new Persons("Ravi", "India");
		Persons p5 = new Persons("Ching", "China");

		List<Persons> persons = Arrays.asList(p1, p2, p3, p4, p5);

		List<Persons> indians = persons.stream().filter(p -> p.country.equals("India")).collect(Collectors.toList());
//		System.out.println(indians.size());
		indians.forEach(i -> System.out.println(i));

	}
}

class Persons {

	String name;
	String country;

	public Persons(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", country=" + country + "]";
	}
}