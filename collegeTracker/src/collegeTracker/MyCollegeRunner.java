package collegeTracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Address;
import model.Program;
import model.Student;

public class MyCollegeRunner {

	Student[] stuArray;
	List<Student> stuList;
	Map<Integer, Student> stuMap;

	public MyCollegeRunner() {

		stuArray = new Student[3];
		stuList = new ArrayList<Student>();
		stuMap = new HashMap<Integer, Student>();

	}

	public void createStudents() {

		// Student 1
		Address address = new Address("101 Elm St", "Austin", "TX", "78766");
		Program program = new Program("100", "EE", "CS", "Frashman");
		Student student = new Student("Nurzat", "Nijat", 555, address, program);

		stuArray[0] = student;
		stuList.add(student);
		stuMap.put(student.getStudentId(), student);

		// Student 2
		address = new Address("123 abc st", "Austin", "TX", "78700");
		program = new Program("200", "SW", "Math", "Senior");
		student = new Student("XXXXXX", "aaaaaa", 666, address, program);

		stuArray[1] = student;
		stuList.add(student);
		stuMap.put(student.getStudentId(), student);

		// Student 3
		address = new Address("789 ert st", "Austin", "TX", "78733");
		program = new Program("300", "AC", "Bio", "Junior");
		student = new Student("YYYYYY", "bbbbbb", 777, address, program);

		stuArray[2] = student;
		stuList.add(student);
		stuMap.put(student.getStudentId(), student);

	}

	public void printStudents() {
		printFromArray();
		printFromList();
		printFromMap();
	}

	public void printFromArray() {
		for (int i = 0; i < stuArray.length; i++) {

			System.out.println("Items from Array: " + stuArray[i]);
		}
		System.out.println();
	}

	public void printFromList() {
		for (Student student : stuList) {
			System.out.println("Items from List: " + student);
		}
		System.out.println();
	}

	public void printFromMap() {
		for (Entry<Integer, Student> student : stuMap.entrySet()) {
			System.out.println("Items from Map: " + student.getValue());
		}
	}

}
