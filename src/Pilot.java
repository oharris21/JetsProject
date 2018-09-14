
public class Pilot {
	private String firstName;
	private String lastName;
	private int yearsOfExperience; 
	
	public Pilot() {
		
	}

	public Pilot(String firstName, String lastName, int yearsOfExperience) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "Pilot [firstName=" + firstName + ", lastName=" + lastName + ", yearsOfExperience=" + yearsOfExperience
				+ "]";
	}

}
