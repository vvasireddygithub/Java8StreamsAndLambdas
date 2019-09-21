package com.java8.stream.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Optional;

public class SportsManager {

	private static ArrayList<Sport> SPORTS = new ArrayList<Sport>();

	public static void loadSportsCSV(String filePath) {
		try {

			Files.lines(Paths.get(filePath)).count();
			Files.lines(Paths.get(filePath)).forEach(line -> {
				if (!line.startsWith("sportID")) { // skip header
					// System.out.println(line);
					SPORTS.add(new Sport(line));
				}
			});

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to read sports file - exiting program");
			System.exit(-1);
		}
	}

	public static ArrayList<Sport> getBanners() {
		return SPORTS;
	}

	public static Sport getSportByStudentID(int studentID) {

		Optional<Sport> mysport = SPORTS.stream().filter(SPORT ->

		SPORT.getStudentID() == studentID).findFirst();

		if (mysport.isPresent())
			return mysport.get();
		else
			return null;
	}

}
