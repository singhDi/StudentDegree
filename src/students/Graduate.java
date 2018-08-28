package students;

import students.*;
public class Graduate extends Student {
	
	private double dropCredits;
	
	public Graduate(Graduate g) {
		super(g.getType(), g.getfName(), g.getlName(), g.getPassword() ,g.getMajor(), g.getCredits());
		dropCredits = g.dropCredits;
		
	}
	
	Graduate(StudentType type, String fname, String lname, String pass, String major, double credits) {
        super(null,fname ,lname ,pass , major , credits);
    }
	
	public double getDropcredits() {
		return dropCredits;
	}
	public void setDropCredits(double dropCredits) {
        this.dropCredits = dropCredits;
    }
	
	@Override
	public void fulltimeOrParttime(double credits){
		double newCredits = getCredits() - getDropcredits();
        if (getCredits() >= getDropcredits()){
            super.setCredits(newCredits);
            if (getCredits() < 9) {
            	System.out.println("The student is part time with " + getCredits());
            } else {
            	System.out.println("The student is full time with " + getCredits());
            }
            
        }
        else {
            System.out.println("Error: You are exceeding the available credits.");
        }
           
    }
    
}
