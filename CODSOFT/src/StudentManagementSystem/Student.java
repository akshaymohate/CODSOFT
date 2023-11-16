package StudentManagementSystem;

public class Student {
	public class student {

	    private String name;
	    private int rollNumber;
	    private double grade;

	    public student(String name, int rollNumber, double grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public double getGrade() {
	        return grade;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public void setGrade(double grade) {
	        this.grade = grade;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
	    }
	}

	public int getRollNumber1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRollNumber() {
		// TODO Auto-generated method stub
		return 0;
	}


}
