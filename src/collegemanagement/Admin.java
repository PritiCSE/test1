package collegemanagement;

public class Admin extends Person {
	private String Admin;
	public String getCourse() {
		return Admin;
	}
	public void setCourse(String department) {
		this.Admin=department;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Admin is:"+Admin);
	}
}
