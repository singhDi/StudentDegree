package students;


public abstract class Student {
	private StudentType type;
    private double credits;
    private String fName, lName, major;
    private String password;
    
    Student() {
    	type = null;
    	fName = "";
        lName = "";
        password = "";
        major = "";
        credits = 0.0;
    }
    
    Student(StudentType type, String fname, String lname, 
    		String pass, String major, double credits ) {
    	this.type = type;
        this.fName = fname;
        this.lName = lname;
        this.password = pass;
        this.major = major;
        this.credits = credits;
     
    }
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }
    public double getCredits(){
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public abstract void fulltimeOrParttime(double credits);

}

