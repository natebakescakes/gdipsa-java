package club;

public class Club {
	
	private int membershipNumber;
	private int currentMemberSize;
	private Member[] members;

	public Club(int initMemberSize) {
		membershipNumber = 0;
		this.currentMemberSize = initMemberSize;
		members = new Member[this.currentMemberSize];
	}
	
	public Member addMember(String firstName, String secondName, String surname) {
		try {
			members[membershipNumber] = new Member(firstName, secondName, surname, membershipNumber + 1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			expandMembershipSize(currentMemberSize * 2);
			members[membershipNumber] = new Member(firstName, secondName, surname, membershipNumber + 1);
		}
		
		membershipNumber++;
		return members[membershipNumber - 1];
	}
	
	public Member addMember(String firstName, String surname) {
		try {
			members[membershipNumber] = new Member(firstName, surname, membershipNumber + 1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			expandMembershipSize(currentMemberSize * 2);
			members[membershipNumber] = new Member(firstName, surname, membershipNumber + 1);
		}
		membershipNumber++;
		return members[membershipNumber - 1];
	}

	private void expandMembershipSize(int newMemberSize) {
		Member[] newMembers = new Member[newMemberSize];
		System.arraycopy(members, 0, newMembers, 0, currentMemberSize);
		currentMemberSize = newMemberSize;
		members = newMembers;
		
		return;
	}
	
	public void removeMember(int membershipNumber) {
		members[membershipNumber - 1] = null;
		return;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Member member : members) {
			if (member != null) {
				sb.append(member);
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
}
