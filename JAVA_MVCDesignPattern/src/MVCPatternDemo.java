
public class MVCPatternDemo {

	public static void main(String[] args) {

		Student student = new Student();
		student.setIdNumber("123");
		student.setName("Peter");

		StudentView studentView = new StudentView();

		StudentController studentController = new StudentController(student, studentView);

		studentController.printView();

		studentController.setStudentName("John");

		studentController.printView();
	}
}
