package com.naveen7.optional;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter User ID : ");
		int userId = sc.nextInt();

		User u = new User();
//		String userName = u.getUserNameById(userId);
//		String msg = userName.toUpperCase() + ", Hello";
//		System.out.println(msg);

		Optional<String> userName = u.getUserName(userId);

		if (userName.isPresent()) {
			String name = userName.get();
			System.out.println(name.toUpperCase() + ", Hello");
		} else {
			System.out.println("No Data Found");
		}

	}
}
