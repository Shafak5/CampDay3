
public class InstructorManager extends UserManager{
	public void addUser(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " +instructor.getLastName() + " added successfully");
	}
}
