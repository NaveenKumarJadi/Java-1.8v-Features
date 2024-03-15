package com.naveen8.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {

	public static void main(String[] args) {

		// of() method with the given values create the object
		LocalDate of = LocalDate.of(2022, 3, 20);
		System.out.println(of);

		// now() represent current date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		date = date.plusDays(3);
		System.out.println(date);

		date = date.plusMonths(1);
		System.out.println(date);

		date = date.plusYears(2);
		System.out.println(date);

		boolean leapYear = LocalDate.parse("2024-12-22").isLeapYear();
		System.out.println(leapYear);

		boolean before = LocalDate.parse("2024-12-22").isBefore(LocalDate.parse("2025-12-22"));
		System.out.println(before);

		boolean after = LocalDate.parse("2024-12-22").isAfter(LocalDate.parse("2025-12-22"));
		System.out.println(after);

		
		LocalTime time = LocalTime.now();
		System.out.println(time);

		time = time.plusHours(2);
		System.out.println(time);

		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		
		Period p = Period.ofDays(5);
		System.out.println(p.getDays());

		Period period = Period.between(LocalDate.parse("1997-11-01"), LocalDate.now());
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());

		
		Duration duration = Duration.between(LocalTime.parse("18:30"), LocalTime.now());
		System.out.println(duration);

	}

}
