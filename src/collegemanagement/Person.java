package collegemanagement;

public class Person {
     private String name;
     private int age;
     public String getName() {
    	 return name;
     }
     public void setName(String name) {
    	 this.name=name;
     }
     public int getAge() {
    	 return age;
     }
     public void setAge(int age) {
    	 if(age>18) {
    		 this.age=age;
    	 }else {
    		 System.out.println("Age must be above 18");
    	 }
     }
     public void displayInfo() {
    	 System.out.println("Name is:"+name+" And Age is:"+age);
     }
}
