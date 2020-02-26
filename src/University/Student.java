package University;

public class Student extends UniversityPerson {

	Student(String _firstName, String _lastName) {
		super(_firstName, _lastName);
	}

	public UniversityPerson read() {
		return this;
	}
	
	public String toString() {
		return "Student ID: " + this.ID + ""
				+ "\n"
				+ "Name: " + this.firstName + ""
				+ "\n"
				+ "Last name: "+ this.lastName;
	}
	
}
