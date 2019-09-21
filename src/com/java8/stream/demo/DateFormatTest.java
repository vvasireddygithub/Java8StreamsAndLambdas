package com.java8.stream.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatTest {

	public static void testDateFormat() {
		// TODO Auto-generated method stub
		// 30-Dec-2022
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		LocalDate parsedDate = LocalDate.parse("03-Dec-2012", formatter);

		System.out.println(parsedDate);

	}

	public static void main(String... strings) {
		testDateFormat();
	}

}
