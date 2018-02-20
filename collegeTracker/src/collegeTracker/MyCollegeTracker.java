package collegeTracker;

public class MyCollegeTracker {

	private static MyCollegeRunner myCollegeRunner;
	
	public static void main(String[] args) {
		//Iterate through each collection and print their FN, LN, Program major, Program year.
		
		myCollegeRunner = new MyCollegeRunner();
		
		myCollegeRunner.createStudents();
		myCollegeRunner.printStudents();
		
	}

}
