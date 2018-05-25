package club;

public class ClubApplication {

	public static void main(String[] args) {
		
		Club club = new Club(5);
		
		club.addMember("John", "Milton", "Smith");
		club.addMember("John", "Smith");
		club.addMember("John", "Smith");
		club.addMember("John", "Smith");
		club.addMember("John", "Smith");
		club.addMember("John", "Smith");
		
		club.removeMember(2);
		
		club.addFacility("Basketball Court", "The club's one and only basketball court.");
		club.addFacility("Tennis Court");
		
		System.out.println(club);
	}

}
