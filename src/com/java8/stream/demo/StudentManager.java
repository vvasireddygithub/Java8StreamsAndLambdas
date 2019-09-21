package com.java8.stream.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

	private static ArrayList<Student> students = new ArrayList<Student>();

	public static void loadStudebtsCSVfile(String filePath) {
		try {
			Files.lines(Paths.get(filePath)).forEach(line -> {
				if (!line.startsWith("studentID"))
					students.add(new Student(line));

			});
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to read student file - exiting program");
			System.exit(-1);
		}
	}

	public static List<Student> getFiveActiveStudentFromCSVFile()

	{

		// Filter all active students
		List<Student> activeList = students.stream().filter(student -> student.isActive()).collect(Collectors.toList());

		// Shuffle the List to get Randomness
		Collections.shuffle(activeList);
		
		List<Student> activestudents;
		
		if (activeList.size()>5)

			activestudents = activeList.subList(0, 5);
		else
			activestudents = activeList;

		return activestudents;

	}

}
