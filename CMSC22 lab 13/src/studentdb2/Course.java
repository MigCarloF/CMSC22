package studentdb2;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Course implements Serializable{
	private String courseCode;
	private String courseDescription;
	
	public Course(String courseCode, String courseDescription){
		this.courseCode = courseCode;
		this.courseDescription = courseDescription;
	}
	
	public String getCourseCode(){
		return courseCode;
	}
	
	public String getCourseDescription(){
		return courseDescription;
	}
	
	public void setCourseCode(String courseCode){
		this.courseCode = courseCode;
	}
	
	public void setCourseDescription(String courseDescription){
		this.courseDescription = courseDescription;
	}
	
	public String toString(){
		return ("Favorite Subject:\n\tCourse Code: " + courseCode + "\n\tCourse Description: " + courseDescription);
	}
}
