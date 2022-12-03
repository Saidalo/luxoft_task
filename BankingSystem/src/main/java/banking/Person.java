package banking;

public class Person {
	private  int id;
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = idNumber;
	}

	public String getFirstName() {
		// complete the function
		return firstName;
	}

	public String getLastName() {
		// complete the function
        return lastName;
	}

	public int getId() {
		// complete the function
		return id;
	}
}
