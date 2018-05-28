package club;

import java.util.Objects;

public class Member extends Person {
	
	private int membershipNumber;

	public Member(String firstName, String secondName, String surname, int membershipNumber) {
		super(firstName, secondName, surname);
		this.membershipNumber = membershipNumber;
	}

	public Member(String firstName, String surname, int membershipNumber) {
		super(firstName, surname);
		this.membershipNumber = membershipNumber;
	}

	public int getMembershipNumber() {
		return membershipNumber;
	}

	@Override
	public String toString() {
		return String.format("%d: %s", this.membershipNumber, super.toString());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getFirstName(), this.getSecondName(), this.getSurname(), this.membershipNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Member other = (Member) obj;
		if (membershipNumber != other.membershipNumber)
			return false;
		
		return true;
	}
}
