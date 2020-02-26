package University;

public abstract class UniversityPerson {
	protected String firstName, lastName;
	protected int ID;
	private static int ID_Counter = 0;
	
	UniversityPerson() {
		firstName = "Null";
		lastName = "Null";
		ID = ++ID_Counter; 
	}
	
	UniversityPerson(String _firstName, String _lastName) {
		firstName = _firstName;
		lastName = _lastName;
		ID = ++ID_Counter;
	}
	
	public abstract UniversityPerson read();
	public abstract String toString();
}
