package University;

public class Undergrad extends UniversityPerson{

	Undergrad(String _firstName, String _lastName) {
		super(_firstName, _lastName);
	}
	
	public UniversityPerson read() {
		return this;
	}
	
	public String toString() {
		return "Name: " + this.firstName + ""
				+ "\n"
				+ "Last name: "+ this.lastName;
	}

}
