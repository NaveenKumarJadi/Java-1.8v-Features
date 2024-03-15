package com.naveen5.methodreference;

import java.util.function.Supplier;

public class ConstructorRef {

	public static void main(String[] args) {

//		Doctor d = new Doctor();

		Supplier<Doctor> s = Doctor::new;
		Doctor doctor = s.get();
		System.out.println(doctor.hashCode());
	}
}

class Doctor {
	public Doctor() {
		System.out.println("Doctor Constructed...");
	}
}
