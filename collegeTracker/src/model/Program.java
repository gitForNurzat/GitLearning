package model;

public class Program {

	private String programId;
	private String major;
	private String minor;
	private String year;

	
	public Program(String programId, String major, String minor, String year) {
		super();
		this.programId = programId;
		this.major = major;
		this.minor = minor;
		this.year = year;
	}

	public String toString () {
		//return programId + "\t " + major + "\t " + minor + "\t " + year;
		return major + "\t " + year;
	}
	
	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
