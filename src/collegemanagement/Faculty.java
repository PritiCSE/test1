package collegemanagement;

public class Faculty extends Person {
	private String department;
	public String getCourse() {
		return department;
	}
	public void setCourse(String department) {
		this.department=department;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("department is:"+department);
	}

}


