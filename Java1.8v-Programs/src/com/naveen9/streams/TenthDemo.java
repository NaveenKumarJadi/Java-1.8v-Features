package com.naveen9.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TenthDemo {

	public static void main(String[] args) {

		Personz p1 = new Personz("John", "USA");
		Personz p2 = new Personz("Steve", "Japan");
		Personz p3 = new Personz("Navin", "India");
		Personz p4 = new Personz("Ravi", "India");
		Personz p5 = new Personz("Ching", "China");

		List<Personz> persons = Arrays.asList(p1, p2, p3, p4, p5);

//		collect names of persons who are belongs to india and store into names collection
		List<String> names = persons.stream()
			   .filter(pa -> pa.country.equals("India"))
			   .map(pa -> pa.name)
			   .collect(Collectors.toList());
		System.out.println(names);
		
	}
}

class Personz {

	String name;
	String country;

	public Personz(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", country=" + country + "]";
	}
}