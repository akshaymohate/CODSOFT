package StudentManagementSystem;

	import java.util.ArrayList;

	public class StudentManagmentSystem {

	    private ArrayList<Student> students;

	    public StudentManagmentSystem() {
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void removeStudent(int rollNumber) {
	        for (int i = 0; i < students.size(); i++) {
	            Student student = students.get(i);
	            if (student.getRollNumber() == rollNumber) {
	                students.remove(i);
	                break;
	            }
	        }
	    }

	    public Student searchStudent(int rollNumber) {
	        for (Student student : students) {
	            if (student.getRollNumber() == rollNumber) {
	                return student;
	            }
	        }
	        return null;
	    }@Override
	    public int hashCode() {
	    	// TODO Auto-generated method stub
	    	return super.hashCode();
	    }

	    public void displayAllStudents() {
	        System.out.println("List of Students:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}


