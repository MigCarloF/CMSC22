package studentdb2;
import java.io.Serializable;
class Student implements Serializable {
	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;
	private String crushName;
	private Course faveSubject;
	
	public Student() {
		
	}

	public Student(String studentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel, String crushName, String faveSubjectCourseCode, String faveSubjectCourseDescription) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.course = course;
		this.yearLevel = yearLevel;
		this.crushName = crushName;
		faveSubject = new Course(faveSubjectCourseCode, faveSubjectCourseDescription);
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public Course getFaveSubject() {
		return faveSubject;
	}

	public void setFaveSubject(Course faveSubject) {
		this.faveSubject = faveSubject;
	}
	public String toString() {
		return "Student Number: " + studentNumber + "\n" +
			   "Name: " + firstName + " " + middleInitial + " " + lastName + "\n" +
			   "Program: " + course + "\n" +
			   "Year level: " + yearLevel;
	}
}