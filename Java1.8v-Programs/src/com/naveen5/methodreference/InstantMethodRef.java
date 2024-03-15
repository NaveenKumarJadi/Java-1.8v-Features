package com.naveen5.methodreference;

public class InstantMethodRef {

	public void m1() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		InstantMethodRef im = new InstantMethodRef();

		Runnable r = im::m1;
		Thread t = new Thread(r);
		t.start();

	}

}
