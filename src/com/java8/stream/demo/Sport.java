package com.java8.stream.demo;

public class Sport {

	private int sportID;
	private int studentID;
	private String sportname;

	public Sport(String line) {
		super();
		String[] fields = line.split(",");
		this.sportID = Integer.parseInt(fields[0]);
		this.studentID = Integer.parseInt(fields[1]);
		this.sportname = fields[2];

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sportID;
		result = prime * result + ((sportname == null) ? 0 : sportname.hashCode());
		result = prime * result + studentID;
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
		Sport other = (Sport) obj;
		if (sportID != other.sportID)
			return false;
		if (sportname == null) {
			if (other.sportname != null)
				return false;
		} else if (!sportname.equals(other.sportname))
			return false;
		if (studentID != other.studentID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sport [sportID=" + sportID + ", studentID=" + studentID + ", sportname=" + sportname + "]";
	}

	public int getSportID() {
		return sportID;
	}

	public void setSportID(int sportID) {
		this.sportID = sportID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getSportname() {
		return sportname;
	}

	public void setSportname(String sportname) {
		this.sportname = sportname;
	}

}
