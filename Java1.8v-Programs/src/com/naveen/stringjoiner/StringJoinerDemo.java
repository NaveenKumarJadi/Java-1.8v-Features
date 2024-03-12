package com.naveen.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("Navin");
		sj1.add("from");
		sj1.add("Pune");
		System.out.println(sj1);

		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("Navin");
		sj2.add("from");
		sj2.add("Pune");
		System.out.println(sj2);
	}
}
