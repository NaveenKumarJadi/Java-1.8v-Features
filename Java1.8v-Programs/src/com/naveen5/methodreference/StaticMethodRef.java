package com.naveen5.methodreference;

@FunctionalInterface
interface MyInterf {
	public void m1();
}

public class StaticMethodRef {

	public static void m2() {
		System.out.println("This is m2() method");
	}

	public static void main(String[] args) {
		MyInterf mi = StaticMethodRef::m2;
		mi.m1();
	}
}
