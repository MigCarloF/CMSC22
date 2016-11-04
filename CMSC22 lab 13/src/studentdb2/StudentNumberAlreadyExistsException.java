package studentdb2;

@SuppressWarnings("serial")
public class StudentNumberAlreadyExistsException extends Exception {
	String studentNumber;

	public StudentNumberAlreadyExistsException(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	String getInfo() {
		return "Student number " + studentNumber + " already exists.";
	}
}
