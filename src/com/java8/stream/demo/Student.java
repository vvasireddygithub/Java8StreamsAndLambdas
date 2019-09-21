package com.java8.stream.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
	// studentID studentname HIGHSCHOOL_START_DATE HIGHSCHOOL_END_DATE

	private int studentID;
	private String studentnameNAME;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((HIGHSCHOOL_END_DATE == null) ? 0 : HIGHSCHOOL_END_DATE.hashCode());
		result = prime * result + ((HIGHSCHOOL_START_DATE == null) ? 0 : HIGHSCHOOL_START_DATE.hashCode());
		result = prime * result + studentID;
		result = prime * result + ((studentnameNAME == null) ? 0 : studentnameNAME.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (HIGHSCHOOL_END_DATE == null) {
			if (other.HIGHSCHOOL_END_DATE != null)
				return false;
		} else if (!HIGHSCHOOL_END_DATE.equals(other.HIGHSCHOOL_END_DATE))
			return false;
		if (HIGHSCHOOL_START_DATE == null) {
			if (other.HIGHSCHOOL_START_DATE != null)
				return false;
		} else if (!HIGHSCHOOL_START_DATE.equals(other.HIGHSCHOOL_START_DATE))
			return false;
		if (studentID != other.studentID)
			return false;
		if (studentnameNAME == null) {
			if (other.studentnameNAME != null)
				return false;
		} else if (!studentnameNAME.equals(other.studentnameNAME))
			return false;
		return true;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentnameNAME() {
		return studentnameNAME;
	}

	public void setStudentnameNAME(String studentnameNAME) {
		this.studentnameNAME = studentnameNAME;
	}

	public LocalDate getHIGHSCHOOL_START_DATE() {
		return HIGHSCHOOL_START_DATE;
	}

	public void setHIGHSCHOOL_START_DATE(LocalDate hIGHSCHOOL_START_DATE) {
		HIGHSCHOOL_START_DATE = hIGHSCHOOL_START_DATE;
	}

	public LocalDate getHIGHSCHOOL_END_DATE() {
		return HIGHSCHOOL_END_DATE;
	}

	public void setHIGHSCHOOL_END_DATE(LocalDate hIGHSCHOOL_END_DATE) {
		HIGHSCHOOL_END_DATE = hIGHSCHOOL_END_DATE;
	}

	private LocalDate HIGHSCHOOL_START_DATE;
	private LocalDate HIGHSCHOOL_END_DATE;

	public Student(String line) {
		super();

		// DateTimeFormatter.ofPattern("yyyy MM dd");
		// DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

		String[] fields = line.split(",");
		this.studentID = Integer.parseInt(fields[0]);
		this.studentnameNAME = fields[1];

		this.HIGHSCHOOL_START_DATE = LocalDate.parse(fields[2], formatter);
		this.HIGHSCHOOL_END_DATE = LocalDate.parse(fields[3], formatter);

	}

	public boolean isActive() {
		LocalDate today = LocalDate.now();
		if ((HIGHSCHOOL_START_DATE.compareTo(today) <= 0) && (HIGHSCHOOL_END_DATE.compareTo(today) >= 0)) {
			return true;
		}
		return false;
	}

}
