package com.naveen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Albert", 32, "Female", "HR", 2020, 45000.00));
		employeeList.add(new Employee(2, "Smith", 55, "Male", "Sales", 2015, 22000.00));
		employeeList.add(new Employee(3, "David", 28, "Male", "Infrastructure", 2012, 30000.00));
		employeeList.add(new Employee(4, "Orlen", 35, "Male", "Development", 2014, 65000.00));
		employeeList.add(new Employee(5, "Ashok", 25, "Male", "Tester", 2016, 35000.00));
		employeeList.add(new Employee(6, "Charles", 26, "Male", "HR", 2013, 55000.00));
		employeeList.add(new Employee(7, "Kiran", 30, "Female", "Development", 2024, 22700.00));
		employeeList.add(new Employee(8, "Monksha", 25, "Female", "Sales", 2019, 28000.00));
		employeeList.add(new Employee(9, "sakhi", 25, "Female", "Sales", 2018, 24000.00));
		employeeList.add(new Employee(10, "sid", 25, "Male", "Sales", 2017, 48000.00));
		
		/*
		 * Map<String, Long> map1 =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.counting())); System.out.println(map1);
		 */
		
		/*
		 * employeeList.stream().map(e -> e.department).distinct().forEach(name ->
		 * System.out.println(name));
		 * 
		 * 	OR
		 * 
		 * employeeList.stream().map(Employee::getDepartment).distinct().forEach(name -> System.out.println(name));
		 */
		
		
		/*
		 * Map<String, Double> map =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingInt(Employee::getAge))); System.out.println(map);
		 */
		
		
		/*
		 * Optional<Employee> optional =
		 * employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(
		 * Employee::getSalary))); if(optional.isPresent()) { Employee employee =
		 * optional.get(); System.out.println(employee); }
		 */
		
		/*
		 * employeeList.stream().filter(e -> e.yearOfJoining >= 2015).map(e ->
		 * e.name).forEach(name -> System.out.println(name));
		 */
		
		/*
		 * Map<String, Long> map1 = employeeList.stream()
		 * .collect(Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.counting())); System.out.println(map1);
		 */
		
		
		/*
		 * Map<String, Double> map = employeeList.stream().collect(
		 * Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.averagingDouble(Employee::getSalary))); System.out.println(map);
		 */
		
		
		/*
		 * Optional<Employee> optional = employeeList.stream() .filter(e ->
		 * e.gender.equals("Male") && e.department.equals("Development"))
		 * .min(Comparator.comparing(Employee::getAge)); if (optional.isPresent()) {
		 * System.out.println(optional.get()); }
		 */
		
		
		/*
		 * Optional<Employee> optional = employeeList.stream()
		 * .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		 * if (optional.isPresent()) { System.out.println(optional.get()); }
		 */
		
		
		/*
		 * Map<String, Long> map = employeeList.stream().filter(e ->
		 * e.getDepartment().equals("Sales"))
		 * .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		 * System.out.println(map);
		 */
		
		
		// Highest salary
		/*
		 * Optional<Employee> optional = employeeList.stream()
		 * .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		 * System.out.println(optional.get());
		 */
		
		// get the emp who is having 2nd highest salary, Approach-1
		// sort emps based on salary descending order then skip first record	
		
		/*
		 * Optional<Employee> findFirst = employeeList.stream()
		 * .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).
		 * findFirst(); System.out.println(findFirst.get());
		 */
		
		// get the emp who is having 2nd highest salary, Approach-2
		
		/*
		 * List<Employee> collect =
		 * employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).
		 * reversed()) .collect(Collectors.toList());
		 * System.out.println(collect.get(1));
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}