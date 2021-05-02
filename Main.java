public class Main {

	public static void main(String[] args) {
		User user1= new User();
		user1.setId(1);
		user1.setFirstName("Aybuke");
		user1.setLastName("Arslan");
		user1.setEmail("a");
		user1.setAge(20);
		

		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Aybuke");
		student1.setLastName("Arslan");
		student1.setEmail("a");
		student1.setAge(20);
		student1.setCourse("Java");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Aybuke");
		instructor1.setLastName("Arslan");
		instructor1.setEmail("a");
		instructor1.setAge(20);
		instructor1.setBranch("Java");
		
		UserManager userManager =new UserManager();
		userManager.add();

	}

}