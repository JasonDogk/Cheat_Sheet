
public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		this.model.setName(name);
	}

	public String getStudentName() {
		return this.model.getName();
	}

	public void setStudentIdentificationNumber(String idNumber) {
		this.model.setIdNumber(idNumber);
	}

	public String getIdentificationNumber() {
		return this.model.getIdNumber();
	}

	public void printView() {
		view.printStudentDetails(model.getIdNumber(), model.getName());
	}
}
