
public class StudentManager extends UserManager{
	public void addUser(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " added successfully");
	}
}
