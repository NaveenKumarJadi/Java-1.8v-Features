package com.naveen.streams;

import java.util.stream.Stream;

public class SecondDemo {

	public static void main(String[] args) {

		User u1 = new User("Anushka", 25);
		User u2 = new User("Ram", 16);
		User u3 = new User("Ashok", 17);
		User u4 = new User("Kiran", 15);
		User u5 = new User("Albert", 22);
		User u6 = new User("Raghu", 30);

		Stream<User> stream = Stream.of(u1, u2, u3, u4, u5, u6);
//		stream.filter(u -> u.age >= 18).forEach(u -> System.out.println(u));
//		stream.filter(u -> u.age >= 18 && u.name.startsWith("A")).forEach(u -> System.out.println(u));

		stream.filter(u -> u.age >= 18).filter(u -> u.name.startsWith("A")).forEach(u -> System.out.println(u));

	}

}

class User {

	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
