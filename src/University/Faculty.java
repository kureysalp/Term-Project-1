package University;

public class Faculty extends UniversityPerson{

	Faculty(String _firstName, String _lastName) {
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
