package students;

import students.StudentType;

interface StudentInterface {
		public String addStudent(int type, String fname, String lname, String pass , String major, double credits);
	    
	    public int getNumGrads();
	    public int getNumUnderGrads(); 
	    public double getTotalCredits();
	    public String printStudentInfo();
	    public String toString(); 

}


