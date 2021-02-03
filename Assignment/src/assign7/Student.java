package assign7;

public class Student {

	private String prn;
	private String name;
	private String email;
	private String marks;
	private String course;
	
	public Student(String prn, String name, String email, String marks, String course) {
		
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;
	}

	
	
	
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ "]";
	}
	
	
	

}
