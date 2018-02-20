package model;

public class Student {

	private String fristName;
	private String lastName;
	private int studentId;
	private Address address;
	private Program program;
	
	
	public Student(String fristName, String lastName, int studentId, Address address, Program program) {
		this.fristName = fristName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.address = address;
		this.program = program; 
	}

	public String toString () {
		//return fristName + "\t " + lastName + "\t " + studentId + "\t " + address + "\t " + program; 
		return fristName + "\t " + lastName;
	}
	
	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
}
