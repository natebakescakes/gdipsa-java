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

		System.out.println(club);
		
		System.out.println(new Facility("Basketball Court", "The club's one and only basketball court."));
		System.out.println(new Facility("Tennis Court"));
		
	}

}
