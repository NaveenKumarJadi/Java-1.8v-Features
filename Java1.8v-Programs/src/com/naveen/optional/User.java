package com.naveen.optional;

import java.util.Optional;

public class User {

	//without optional object
	public String getUserNameById(Integer id) {
		if (id == 100) {
			return "shiva";
		} else if (id == 101) {
			return "Ram";
		} else if (id == 102) {
			return "Albert";
		} else {
			return null;
		}
	}

	//with optional object
	public Optional<String> getUserName(Integer id) {

		String name = null;

		if (id == 100) {
			name = "Shiva";
		} else if (id == 101) {
			name = "Ram";
		} else if (id == 102) {
			name = "Albert";
		}
		return Optional.ofNullable(name);
	}
}
