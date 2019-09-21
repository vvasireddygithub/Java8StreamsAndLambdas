package com.java8.stream.demo;

import java.util.List;

public class Main {
	/*
	 * args[0] - Pass Path for Student file args[1] - Pass Path for Sport file
	 * 
	 */
	public static void main(String... args) {

		String studentFilePath = args[0]; // Student file path
		String sportsfilePath = args[1]; // Sport file path

		System.out.println(studentFilePath);
		System.out.println(sportsfilePath);

		System.out.println("*************");

		// Write an application that reads the students and sports CSV files into
		// memory.

		SportsManager.loadSportsCSV(sportsfilePath);
		StudentManager.loadStudebtsCSVfile(studentFilePath);

		List<Student> tenactivestudents = StudentManager.getFiveActiveStudentFromCSVFile();

		// for each active Student - who are playing any sport

		tenactivestudents.stream().forEach(student -> {
			int studentid = student.getStudentID();
			Sport sport = SportsManager.getSportByStudentID(studentid);
			if (sport != null)
				System.out.println(" ****** sports name ******** " + sport.getSportname());

		});

	}

}
