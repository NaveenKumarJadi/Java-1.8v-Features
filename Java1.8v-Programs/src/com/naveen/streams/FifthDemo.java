package com.naveen.streams;

import java.util.stream.Stream;

public class FifthDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("David", 22, 22000.00);
		Employee e2 = new Employee("Albert", 25, 45000.00);
		Employee e3 = new Employee("John", 19, 25000.00);
		Employee e4 = new Employee("Smith", 32, 62000.00);

		Stream<Employee> stream = Stream.of(e1, e2, e3, e4);
//		stream.filter(e -> e.salary >= 55000.00)
//			  .map(e -> e.name + " - " + e.age)
//			  .forEach(e -> System.out.println(e));

		stream.filter(e -> e.salary >= 55000.00).forEach(e -> System.out.println(e.name + " - " + e.age));
	}
}

class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}