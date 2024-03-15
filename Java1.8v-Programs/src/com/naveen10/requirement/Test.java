package com.naveen10.requirement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Albert", 26500.00, "USA");
		Employee e2 = new Employee(2, "Michel", 46500.00, "INDIA");
		Employee e3 = new Employee(3, "John", 27800.00, "CHINA");
		Employee e4 = new Employee(4, "Oleg", 32500.00, "INDIA");
		Employee e5 = new Employee(5, "David", 44500.00, "USA");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
//		Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);

		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max Salary :: " + max.get().salary);

		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min Salary :: " + min.get().salary);
		
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average Salary :: " + avgSalary);
		
//		groupingBy() it used to categorize the data
		Map<String, List<Employee>> data = list.stream().collect(Collectors.groupingBy(e -> e.country));
		System.out.println(data);

	}

}

class Employee {
	int id;
	String name;
	double salary;
	String country;
	
	public Employee(int id, String name, double salary, String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
	
	
}