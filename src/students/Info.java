package students;

import java.io.IOException;
import java.util.ArrayList;
import students.StudentType;
import students.Student;

public class Info implements StudentInterface {
	private String fname;
	private String lname;
	private String pass;
	private String email;
	private String major;
	private int choice, numGrads, numUnderGrads;
	private int gpa;
	private String type;
	private ArrayList<Student> students = new ArrayList<>();

	Info() {
		numGrads = 0;
		numUnderGrads = 0;
		students = new ArrayList<>();
		type ="";

	}

	public String addStudent(int choice, String fname, String lname, String pass , 
			String major, double credits) {
		switch (choice) {
		case 1:
			students.add(new Graduate(StudentType.fromString("Graduate"), fname , lname, pass, major, credits));
			numGrads++;
			return "Successfully added";
		case 2:
			// type.equalsIgnoreCase("Savings");
			students.add(new UnderGraduate(StudentType.fromString("UnderGraduate"), fname , lname, pass, major, credits));
			numUnderGrads++;
			break;
		default:
			return "Added";
		}
		return null;
	}

	public int getNumGrads() {
		return numGrads;
	}
	public int getNumUnderGrads() {
		return numUnderGrads;
	}

	 public double getTotalCredits() {
		 double credits = 0.0;
		 for(int i = 0; i <students.size(); i++){
	       
	           credits = students.get(i).getCredits(); 
	          
	        }
	     return credits; 
	 }
	public String printStudentInfo() {
		return "\nNumber of Graduate Students: "+ getNumGrads() + "\nNumber of Undergraduate Students: " + getNumUnderGrads();
	}
	public String toString() {
		return students.toString();
	}

}

