package collegemanagement;

public class Student extends Person {
	private String course;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Course is:"+course);
	}

}
