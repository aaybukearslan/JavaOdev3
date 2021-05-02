
public class Student extends User {
	private String course;

	public Student() {
		super();
		
	}

	public Student(int id, String firstName, String lastName, String email, int age) {
		super(id, firstName, lastName, email, age);
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	

	


	
}