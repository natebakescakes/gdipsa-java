package club;

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
	
}
