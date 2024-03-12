package com.naveen;

interface Vehicle{
	
	public void start();
	
	public default void defaultClean() {
		System.out.println("default Cleaning completed...");
	}

//	If we don't want to override our interface methods then we can declare interface methods as static methods
	public static void staticClean() {
		System.out.println("Static Cleaning completed...");
	}
}

public class Car implements Vehicle {

//	Overriding of default method
	public void defaultClean() {
		System.out.println("My Cleaning completed...");
	}
	
	public void start() {
		System.out.println("Car Started...");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.defaultClean(); //we are overridding clean() method of Vehicle interface
		Vehicle.staticClean(); //static methods we can call by using interface name
	}
}
