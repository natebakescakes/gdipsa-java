
public class Person {
	private String surname;
	private String firstName;
	private String secondName;
	
	/**
	 * @param surname
	 * @param firstName
	 * @param secondName
	 */
	public Person(String firstName, String secondName, String surname) {
		super();
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	/**
	 * @param surname
	 * @param firstName
	 */
	public Person(String firstName, String surname) {
		this(firstName, null, surname);
	}

	public String getSurname() {
		return surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	@Override
	public String toString() {
		if (this.secondName != null)
			return String.format("%s %s %s", this.firstName, this.secondName, this.surname);
		
		return String.format("%s %s", this.firstName, this.surname);
	}
}
